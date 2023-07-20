#Java接口

##了解 Java 接口

Java 接口为您提供了一种在代码中定义“作业”的方法。当您需要完成一项工作时，您不太关心谁（哪个对象）执行这项工作，而是更关心输出。这就是接口发挥作用的地方。

在您的 Android 和 Java 课程中，您将遇到 Java 的界面。接口类似于类，但接口不是定义现实世界的对象，例如汽车、人或文档，而是定义作业。例如，在 Android 中，响应屏幕上“点击”的代码是由接口定义的，因此，处理点击是被点击元素需要完成的工作。

在代码中，Java 接口是方法名称的集合（只有名称，没有函数体），这些函数是作为接口定义的作业的一部分执行的函数。

例如，如果我们有一个Person班级，这个人可能会执行许多不同的工作；一个类可以实现任意数量的接口。

因此接口定义了类可以执行的工作。这是如何运作的？让我们考虑一个例子。ArrayList是一个实现List接口的类。实现List意味着该类必须包含超过两打方法，例如size()、add(E element)和 get(int index)。

我们之前提到，这些方法的实际代码并未指定，但仅凭它们的名称就可以让您了解该List接口代表什么类型的工作 - 列出项目并返回有关列表的信息的工作。任何实现的类都List应该能够返回列表的大小，向列表添加更多元素，并获取/返回特定索引处的项目。请随意验证是否ArrayList能胜任所有这些事情。

接口被证明是有用的，因为无论是在代码中还是在生活中，我们经常希望完成一项工作，但很少关心它是如何完成的，即“目的不择手段”之类的事情。在汽车工厂，员工可以造车，机器人也可以造车。两者都以独特的方式履行这些角色，但工厂关心的是最终的汽车，而不是它的制造方式（不幸的是）。

接口的工作方式相同。ArrayList使用数组作为其基本数据结构。但其他类List使用其他数据结构来实现。例如，LinkedList和类分别使用链表和堆栈Stack来完成这项工作。List

在这里，我们将向您展示如何通过使用您自己的类实现接口来获得乐趣！如果您愿意，您将能够使用专门设计用于跟踪袜子和内衣的类List来实现该接口 。LaundryList



##定义接口

###定义接口与定义类类似：

interface CarBuilder {
    … interface methods here
}

主要区别在于，在接口定义中，我们不实现任何内容：

interface CarBuilder {
 
    // A CarBuilder must be able to assemble a CarDoor
    CarDoor assembleCarDoor();
 
    // A CarBuilder must be able to assemble a Wheel
   Wheel assembleWheel(double radius);
 
}

请注意此接口定义的方法如何具有返回类型、名称、参数，并且（再次）没有其他内容。由实现这些接口角色的类来填充方法代码。

接口本身不知道类将如何（或哪些）实现其要求，但它承诺它们会（以某种方式）。

接口还可以定义与该接口的所有实现保持相关的数据，这些数据不能被修改。

interface CarBuilder {
    double MAX_WHEEL_RADIUS_CM = 60.0;
    ...
}

当类实现接口时，它也会继承该数据。



##实现接口
让我们看看一个类如何实现上面的接口。我们将回到 1930 年，当时所有汽车都是手工制造的：

// Note the `implements CarBuilder`
class AutoWorker extends Person implements CarBuilder {
    ...
}

上面的类AutoWorker具有父类型Person并履行 的角色CarBuilder。虽然一个类只能从另一个类继承，但它可以实现任意数量的接口：

class AutoWorker extends Person implements CarBuilder, CarMechanic, Employee {
    ...
}

为了履行这些接口角色，类必须通过重写方法定义来实现每个接口规定的方法：

class AutoWorker extends Person implements CarBuilder {
    public AutoWorker(String name, int age, int salary) {
        ...
    }
 
    …
 
    // CarBuilder Interface begins
 
    @Override
    public CarDoor assembleCarDoor() {
        // Put together the car door here
        …
        return carDoor;
    }
 
    @Override
    public Wheel assembleWheel(double radius) {
 
        ...
        if (radius > MAX_WHEEL_RADIUS_CM) {
            // modify wheel radius
        }
        // Put a wheel together here
        …
        return wheel;
    }
}

正如我们所看到的，AutoWorker实现assembleCarDoor()并assembleWheel(double)满足接口的要求CarBuilder。如果没有这些方法，这个类将无法编译！

现在我们了解了如何实现接口，让我们考虑一下为什么我们可以定义一个接口而不是扩展单个类的职责。



##接口多态性

就像我们将对象与公共祖先类分组一样，我们可以将对象与公共接口分组。

历史快进到现在，AutoFactory生产汽车有两种选择：人类和机器人。

class AutoWorker extends Person implements CarBuilder {...}
class AutomatedAutoWorker extends Robot implements CarBuilder {/* beep boop */...}

但工厂不会解雇所有人类并让机器人接管，而是通过慢慢纳入自动化工人来实现劳动力资源的多样化……这可能是这样的：

class AutoFactory {
 
    // An ArrayList of CarBuilder implementations, not AutoWorker or AutomatedAutoWorker
    ArrayList<CarBuilder> carBuilders;
 
    public void startFactory() {
        AutomatedAutoWorker robot1 = new AutomatedAutoWorker();
        AutomatedAutoWorker robot2 = new AutomatedAutoWorker();
        AutomatedAutoWorker robot3 = new AutomatedAutoWorker();
 
        AutoWorker employee1 = new AutoWorker();
        AutoWorker employee2 = new AutoWorker();
        AutoWorker employee3 = new AutoWorker();
        AutoWorker employee4 = new AutoWorker();
 
        carBuilders = new ArrayList<>;
 
        // Add all the robots to the carBuilders ArrayList
        carBuilders.add(robot1);
        carBuilders.add(robot2);
        carBuilders.add(robot3);
 
        // Add all the  meat-based employees to the carBuilders ArrayList
        carBuilders.add(employee1);
        carBuilders.add(employee2);
        carBuilders.add(employee3);
        carBuilders.add(employee4);       
    }
}

ArrayList虽然我们通常在其他模板化对象中使用类类型，但这里我们使用接口类型。对象列表CarBuilder要求每个列表元素都实现该CarBuilder接口，仅此而已。我们可以利用这一点来发挥我们的优势，就像在makeWheels()方法中一样：

class AutoFactory {
 
    ArrayList<CarBuilder> carBuilders;
 
    public void startFactory() {
        ...
    }
 
 
    private Wheel [] makeWheels (int numberOfWheels, double radius) {
        // Establish an array to hold all the new Wheel objects
        Wheel [] newWheels = new Wheel [numberOfWheels];
 
        // Set up the loop
        int wheelCount = 0;
        while (wheelCount < numberOfWheels) {
 
            // Use the first CarBuilder, we don't care if it's man… or machine!
            CarBuilder carBuilder = carBuilders.remove(0);
 
            // Perform the job
            Wheel newWheel = carBuilder.assembleWheel(radius);
 
            // Add the new Wheel to our set
            newWheels[wheelCount] = newWheel;
 
            // Increment our total wheel count
            wheelCount = wheelCount + 1;
        }
        return newWheels;
    }
    
AutomatedAutoWorker这允许我们将对象与同一列表和方法中的对象混合AutoWorker，即使前者继承自Robot，而后者继承自Person。

在这个例子中，我们说明了关键点：接口使我们能够专注于需要完成的工作，而不是完成工作的方式。在某些情况下，我们只需要对象来履行接口指定的角色，而它们的确切类仍然无关紧要。



##内联接口定义

在类级别实现接口有时会很麻烦。正如您稍后将看到的，一个类可能需要以不同的方式履行其接口角色，具体取决于它为谁工作。

在 Android 中，该类Activity负责处理屏幕上的点击。每当用户点击按钮或导航元素时，该类Activity都会通过名为 的界面进行响应OnClickListener。

所需的唯一方法OnClickListener如下所示：

public interface OnClickListener {
 
    // Handle a click on View v
    void onClick(View v);
 
}

假设一个 Activity 呈现多个可点击元素，则单个onClick()接口方法必须响应每个可能的点击！以下是运行跟踪应用程序中的活动的外观：

class RunningActivity extends Activity implements OnClickListener {
 
    @Override
    public void onClick(View v) {
        // if `v` is the ‘Start Run’ button, do this {…}
        ...
        // else if `v` is the ‘End Run’ button, do this {…}
        ...
        // else if `v` is the ‘Pause Run’ button, do this {…} 
        ... so on, and so forth
    }
}

因此，随着RunningActivity提供更多功能和可点击元素，这种单一界面方法的长度和复杂性将会增加。如果屏幕具有超过 10 个可点击元素，则RunningActivity必须用一种方法执行 10 项独特的作业。

为了解决这个限制，我们使用内联接口定义。内联接口定义，定义为成员变量，如下所示：

class RunningActivity extends Activity {
 
   OnClickListener handleStartRunButtonClick = new OnClickListener() {
        @Override
        public void onClick(View v) {
            … handle ‘Start Run’ button click
        }
    }
    ...
}

看起来我们声明了一个新的“接口”，但接口不是类——那么这里到底发生了什么？

在底层，Java 定义了一个类似于以下内容的匿名对象：

class ANON_CLASS_123456789 implements OnClickListener {
    @Override
    public void onClick(View v) {
        … handle ‘Start Run’ button click
    }
}

然后 Java 创建这个匿名类的实例，handleStartRunButtonClick以便在我们的代码中使用：

class RunningActivity extends Activity {
 
    OnClickListener handleStartRunButtonClick = new OnClickListener() {
        @Override
        public void onClick(View v) {
            … handle ‘Start Run’ button click
        }
    }
    …
    startRunButton.setOnClickListener(handleStartRunButtonClick);
    ...
}

现在，屏幕上的每个可点击元素都可以拥有自己的OnClickListener界面对象，而无需将点击处理捆绑到单个方法中。

我们甚至可以使用内联定义而不首先将它们声明为成员变量：

        ...
        startRunButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                … handle ‘Start Run’ button click
            }
        });
    }
}

无论是作为内联定义还是作为类的一部分，接口都可以帮助我们将责任与分类分开。当我们的代码需要完成一项工作，并且该工作可能由多种对象类型来满足时，接口定义允许任何对象来履行该角色。

