取消引用 Capstone 项目

以之前的项目为基础，创建一个生动活泼的 Android 应用程序！

客观的
这是一条漫长的路，现在是你完成旅程的时候了。

使用您所学到的有关应用程序设计、Java、XML 和 Android 的所有知识来实现​​ Unquote。

在此项目中，您将整合之前应用程序构建项目的成就，并将其封装成一个可运行的 Android 游戏。

第 1 部分：准备您的项目
取消引用基本上已经完成了一半，但是到目前为止您生成的代码已经存在于 Codecademy 的平台上。在本部分中，您将把之前的工作合并到Unquote Android Studio 项目中，并首次启动您的应用程序。

我们鼓励您使用迄今为止构建的所有代码。但如果您愿意，您可以在此 zip 文件夹中访问MainActivity.java、Question.java和Activity_main.xml的代码

1-A。打开您的取消引用 Android 项目
如果您不再有权访问该项目，请使用以下参数创建一个新的 Android 项目：

名称：取消引号
最低 API 级别：16
语言：Java
模板：空活动
1-B。准备MainActivity.java
导航到MainActivity.java您的项目，然后删除该文件中最顶行下方的所有内容。删除以下所有内容：package com.{your-company-name}.unquote;。

暗示

1-C。粘贴到 MainActivity.java
MainActivity.java将本节中包含的文件内容复制到您的MainActivity.java项目文件中。

不要复制最上面的行：因为这会与您的实际包名称package com.example.unquote;冲突。


暗示

1-D。创建一个问题类
打开后MainActivity.java，导航至“文件”菜单。

选择“文件”，然后选择“新建”，然后单击“Java 类”。在类名称字段中输入“问题”，然后单击“确定”。

完成此任务后，请继续关注该Question.java选项卡。

1-E。粘贴到 Question.java
复制本节中包含的文件内容Question.java，并将其粘贴到QuestionAndroid Studio 中类的大括号之间。

暗示

1-F。打开并清除activity_main.xml
打开activity_main.xml布局文件。您可以在资源管理器的布局部分找到它。

打开后，如果您看不到“文本”或“代码”（XML 内容），请切换到允许您直接编辑底层 XML 内容的视图。

选择文件中的每一行activity_main.xml并将其删除。

1-G。把所有的东西都换掉
复制本节中包含的文件内容activity_main.xml并将其粘贴到项目的activity_main.xml.

如果您想使用activity_main.xml在之前的Unquote项目中创建的布局文件，请使用声明的属性面板修改现有的组件 ID 以匹配以下内容：

成分	ID
报价图片查看	iv_main_question_image
问题文本查看	tv_main_question_title
提交按钮	btn_main_submit_answer
回答 0 按钮	btn_main_answer_0
接听 1 按钮	btn_main_answer_1
接听 2 按钮	btn_main_answer_2
接听 3 按钮	btn_main_answer_3
TextView 剩余问题数（“99”）	tv_main_questions_remaining_count
剩余问题 TextView（“剩余问题”）	tv_main_questions_remaining
1-H。第一次运行取消引用
您需要一部真正的 Android 手机或 Android 虚拟设备才能运行Unquote。

如果您需要有关如何创建虚拟设备以及如何为个人设备启用开发模式的指导，请参阅本文。

1-I。没什么可看的……
但这都是你的！进入下一部分继续构建Unquote。

第 2 节. 导入艺术品
演示将普通应用程序与特殊应用程序区分开来，因此我们创建了一个自定义Unquote应用程序图标和 6 张手绘报价图像，供您向玩家演示。

在本节中，您将把这些资源导入到您的应用程序中，修改应用程序的启动器图标，并将该图标呈现给内部的玩家MainActivity。

2-A。下载艺术品
Unquote所需的每个文件都位于此 zip 存档内。下载文件夹并将其解压到桌面。

2-B。在 Android Studio 中，显示资源管理器
如果找不到资源管理器，请在菜单下查找“视图” > “工具窗口” > “资源管理器”。

2-C。将 unquote-drawables 文件夹拖到资源管理器面板中
这将使文件成为Unquote的一部分，并可供您的代码和布局访问。


您可以在 Windows 或 OS X 中通过单击文件夹图标并将其拖到资源管理器窗口中来执行此操作。


这将显示导入 Drawables向导，Drawables 是与应用程序捆绑在一起的图像和图形。


单击“下一步”按钮，然后在接下来的屏幕上单击“导入” 。瞧，这些图像现在是Unquote的一部分！

2-D。打开 AndroidManifest.xml
AndroidManifest.xml您可以在项目树中的app > manifests >下找到该文件AndroidManifest.xml。

2-E。使用您的自定义取消引用图标
AndroidManifest.xml除此之外，它还告诉 Android 操作系统在哪里可以找到您的应用程序图标。它通过两行提供此信息：

        <!-- some attributes here -->
        android:icon="@mipmap/ic_launcher"
        <!-- more attributes -->
        android:roundIcon="@mipmap/ic_launcher_round"
        <!-- and more attributes -->
从 Android v26 开始，Google 建议您提供自适应图标，允许设备将角变圆或将图像切割成他们认为合适的任何形状。你不会那样做的。

为了简化，删除第二行并将第一行更改为android:icon="@drawable/ic_unquote_icon"。名为的图像ic_unquote_icon与您之前导入的图像捆绑在一起。

2-F。保存并重新启动
重新启动您的应用程序并查看Unquote闪亮的新图标！


暗示

2-G。炫耀一下
您可能已经看到一些时髦的应用程序将其应用程序图标放置在其界面的顶部栏（也称为 ActionBar）中。

为了确保Unquote保持时尚，您最终将开始履行所有这些小评论留下的承诺TODO。

TODO 2-G在以下位置添加以下四行MainActivity：

        // TODO 2-G: Show app icon in ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_unquote_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setElevation(0);
不用担心学习这些方法，它们是小众 Android API，您无需立即掌握。

保存并重新启动“取消引用”即可在大（小）屏幕上看到精美的新图标。现在感觉很正式，不是吗？

2-H。使用“真实”的假报价
打开MainActivity，然后向下滚动到您的startNewGame()方法。

使用该对象将每个对象的R.drawable第一个参数 () 替换为适当的假报价图像。int imageIdQuestionTODO 2-H

确保Question总共有 6 个对象，并使用此 PDF中提供的问题和答案。

稍后，您将使用该成员变量来设置屏幕Question.imageId上呈现的图像。ImageView


暗示

2-I。在下一节中...
您将恢复视图并开始在屏幕上显示这些引言、他们的问题以及他们可能的答案！

“太好啦！太好啦！太好啦！”

— Isla Von Frederickson 博士
可能是髋关节置换术的发明者


第 3 节. 查找并分配视图对象
如果不首先恢复 View 对象，您将无法更新任何文本、使用图像资源或响应单击。在本节中，您将从布局中提取 View 对象并开始在代码中使用它们。

让我们开始！

3-A。声明View成员变量
您可以findViewById()在 中的任何地方MainActivity使用，但对于复杂的布局，此方法会变得昂贵 - 昂贵是因为您的用户可能会发现应用程序暂时无响应或缓慢（滞后），因为您的代码重复调用findViewById()。

要解决此限制，请将所需的所有视图声明为MainActivity成员变量。然后，MainActivity可以在任何地方访问和修改视图，而无需重新调用findViewById()。

为您的代码需要访问的每个视图声明一个成员变量 at TODO 3-A，以下是我们推荐的名称（并将在示例中使用）：

questionImageView
questionTextView
questionsRemainingTextView
answer0Button
answer1Button
answer2Button
answer3Button
submitButton

暗示

3-B。分配所有 View 成员变量
用于findViewById()将每个 View 成员变量分配给位于 处的膨胀 View 对象TODO 3-B。

请记住，findViewById()找到与给定标识符（在布局中提供）相对应的视图activity_main.xml，并让您在代码中直接控制该视图。


暗示

3-C。显示剩余问题数
恢复所有视图后，您就可以displayQuestionsRemaining()在 处构建方法了TODO 3-C。

此方法不返回任何内容 ( void)，并将剩余问题的数量作为整数参数。

声明方法并让它修改questionsRemainingTextView对象。


暗示

3-D。使用displayQuestionsRemaining()
此方法现在功能齐全，取消注释并在必要时调用它（TODO 3-D.i和TODO 3-D.ii）。

更新剩余计数在这两个时刻至关重要，它们是代码中我们更改剩余问题数量的唯一位置。第一个是在玩家提交答案之后，第二个是在我们创建新游戏之后。


暗示

3-E。重新运行取消引用
通过displayQuestionsRemaining()行动，您现在有了一个可以工作的问题计数器！

重新运行Unquote后，您应该看到“剩余 6 个问题”（而不是 99）。如果没有，请返回检查您的工作！


暗示

3-F。声明显示问题()
此方法不返回任何内容 ( void)，并将修改Question向玩家呈现对象所需的所有 View 对象。

首先声明该方法并将主体保留为空TODO 3-F。

3-G。实现显示问题()
您应该有权访问实现此方法所需的每个视图：您的 main ImageView、您的问题TextView和您的四个答案Button视图（全部在 3-A 中声明为成员变量）。

您必须使用setText()或setImageResource()方法修改这些 View 对象。


暗示

3-H。取消注释 displayQuestion()
对于TODO 3-H.i和TODO 3-H.ii，删除这些行前面的注释（删除//）。

在 处3-H.i，我们在选择一个新问题供玩家回答后立即调用此方法。并且在3-H.ii,


暗示

3-I。重新运行取消引用
如果一切按计划进行，您应该会在屏幕上看到 6 个可用问题之一！

图像、问题和四个答案都应反映 中提供的数据startNewGame()。如果没有，请返回检查您的工作。


暗示

第 4 节：使用 onAnswerSelected() 选择答案
最后！玩家可以在屏幕上看到一个问题，这几乎完成了 80% 的工作。剩下的就是确保点击和点击屏幕会产生玩家期望的准确响应。

在本部分中，您将使玩家能够从每个问题提供的四个可能答案中选择一个。

4-A。声明 onAnswerSelected()
此方法不返回任何内容 ( void)，并且需要一个整数来标识玩家的答案（0 到 3）。

该方法不仅会设置playerChoice成员变量，还会执行许多界面和逻辑更新以保持游戏继续进行。

在 处声明此方法TODO 4-A。您将在 中完成以下 3 个任务onAnswerSelected()。

4-B。恢复当前问题
您的第一个任务onAnswerSelected()是更新底层Question对象以反映玩家的选择。

首先将对当前对象的引用保存Question在名为 的变量中currentQuestion。


暗示

4-C。更改玩家的答案
在 中Question，您定义了一个名为 的成员变量playerAnswer来跟踪玩家选择的答案。

修改对象playerAnswer的成员变量currentQuestion以匹配玩家的选择（answerSelection）。


暗示

4-D。表明一个选择
当玩家做出选择时，您需要显示一些视觉指示来表明他们所做的选择。

实现此目的的一种方法是在✔给出的答案的开头添加一个符号Button。

例如，Button“Abraham Lincoln”的答案在玩家单击后会变成“✔ Abraham Lincoln”。

使用“✔”符号，在此页面上突出显示它，复制并粘贴到您的代码中！


暗示

4-E。聆听点击声
使用该View.setOnClickListener()方法将空的点击侦听器分配给Button位于 的所有四个答案视图TODO 4-E。


暗示

4-F。每个按钮，一个选择
当用户单击答案按钮时，他们没有意识到每个答案都与一个数字（0、1、2 和 3）相关联，他们只知道自己做出了哪个选择。

但是您为每个事件提供的点击处理程序Button必须onAnswerSelected()根据每个事件Button代表的底层答案标识符进行调用。

在四个点击侦听器中的每一个中，onAnswerSelected()使用适当的answerSelected参数进行调用。


暗示

4-G。运行取消引用
并做出您的选择！

如果一切看起来都正确，那么就有问题了。

4-H。你也注意到了，是吗？
如果您的逻辑正确，则每个答案在您单击后Button都会显示一个复选符号 ( )。✔

然而，即使您的“选择”发生变化，您之前的选择仍然被选择！你如何解决这个问题？

思考几分钟，然后继续进行 4-I。


暗示

4-I。冗余挽救了局面
Button要解决 4-H 中发现的问题，请在 4-E 中添加的逻辑之前重置所有四个答案视图的文本。

这意味着，通过setText()再次使用，您可以将所有按钮重置到其起始位置（无“✔”）。


暗示

4-J。尝试再尝试
再运行一次“取消引用”Button ，然后观察您的选择从一个到下一个的优雅移动！

凭借您选择正确答案的能力，您距离为玩家评分并结束游戏又近了一步。

第 5 节. 游戏结束
一场永远不会结束的游戏根本就不是游戏，而是一场噩梦。

在本部分中，您将允许玩家（无论输赢）结束他们的Unquote回合。如果他们敢于再次测试他们的知识，你就会给他们这个机会。

5-A。提交时点击
Button使用View.setOnClickListener()at将点击侦听器分配给您的提交答案TODO 5-A。

单击Button布局右下角的 时，会锁定玩家的选择并移至下一个问题（或结束游戏）。


暗示

5-B。调用 onAnswerSubmission()
您在上一个项目中就开始使用此方法，现在您可以使用它了！

从 5-A 中声明的点击处理程序调用此方法，以允许玩家提交他们的最终答案。


暗示

5-C。玩一个完整的游戏
取消引用现在可以播放了！玩游戏并在 Android Studio 中观看Logcat以获取游戏结束消息。

有点虎头蛇尾吧？让我们解决这个问题。

5-D。开始对话
以前，您的应用程序将游戏结束消息打印到Logcat，但AlertDialog可以帮助您将此消息呈现给真正会阅读它的人：玩家。

在 Android 中，您可以使用内置 API 来显示一个小型弹出窗口，其中包含自定义消息和可单击选项。该弹出窗口称为AlertDialog.

在 处TODO 5-D，删除该System.out…行，并将其替换为以下内容：

            // TODO 5-D: Show a popup instead
            AlertDialog.Builder gameOverDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            gameOverDialogBuilder.setCancelable(false);
此类Builder可帮助您生成符合播放器设备视觉主题的弹出窗口（它始终看起来正确）。

该AlertDialog.Builder.setCancelable()方法可以防止玩家通过点击弹出窗口外部意外取消弹出窗口。

5-E。给它一个标题
标题AlertDialog作为一条短消息显示在弹出窗口的顶部。

用于AlertDialog.Builder.setTitle()为紧邻 5-D 中添加的代码下方的弹出窗口设置此短消息。


暗示

5-F。传播消息
用于向玩家AlertDialog.Builder.setMessage()展示您的内容。gameOverMessage它将gameOverMessage在弹出窗口中显示为一小段文本。


暗示

5-G。再给他们一次机会……
最后，让我们再给玩家一次Unquote的机会。

AlertDialog可以呈现积极、中性和消极按钮（从左到右或从上到下指示它们的位置，具体取决于设备）。

使用以下代码创建一个肯定AlertDialog按钮，将其放置在您为 5-F 编写的代码的正下方：

            // (5-F code)
            gameOverDialogBuilder.setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    startNewGame();
                }
            });

暗示

5-H。呈现对话框
AlertDialog当使用对象创建时AlertDialog.Builder，您必须在它出现在屏幕上之前调用另外两个方法。在上一个任务中的代码下方添加以下行：

            // (5-G code)
            gameOverDialogBuilder.create().show();
5-I。再玩一次，萨姆
重新启动取消报价并进行另一轮。这次，您的游戏结束消息应该出现在一个简单而有效的弹出窗口中！

按“再玩一次！”，Unquote开始新一轮的问答游戏！

第 6 节. 接受挑战
取消引用看起来不错并且运行良好。在最后一部分中，我们要求您找到（并修复）一些错误，并添加一组新的琐事问题供玩家回答。

本节的提示不会像前面的那么详细，所以请发挥你的思维能力！😉

6-A。请提交
当您在选择选项之前提交答案时会发生什么？


暗示

6-B。修复此错误
提交答案时，Unquote必须首先确保玩家选择了答案（默认的 除外-1）。

您如何检查这种情况以及您应该在哪里检查它以防止Unquote接受-1作为答案？


暗示

6-C。更多问题，更多答案
当您精心构建Unquote时，我们的图形艺术家有时间消磨时间，因此我们让他们设计更多报价供您在游戏中使用。

下载这些附加资源并将其解压缩到您的桌面。在里面，您会发现另外 7 个可在Unquote中使用的报价图像，以及一个详细说明每个图像附带的问题和答案的 PDF！

6-D。创建第二组 Question 对象
将 6-C 中的图像导入为 Drawable 后，在前 6 个对象的正下方再定义 7 个Question对象，并将它们添加到列表中。startNewGame()Questionquestions

6-E。扭转一下……
第一组报价与第二组报价有很大不同。

您将使用循环和generateRandomNumber()方法从可用的 13 个问题中选择 6 个问题 — 这些是您的玩家每轮必须回答的 6 个问题。

你会怎么做？


暗示

6-F。设置你的循环
您需要一个运行 7 次的循环，现在就设置一个。


暗示

6-G。随机选择一个
Question在循环中，您需要从questions列表中随机选择一个对象。

使用（您在游戏逻辑第一部分generateRandomNumber()中编写的方法）随机选择一个。Question


暗示

6-H。删除随机选择的 Question 对象
ArrayList.remove()允许您根据项目在列表中的位置（索引）从列表中删除项目。使用此方法删除随机选择的Quesion对象。


暗示
