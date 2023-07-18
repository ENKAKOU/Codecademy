# XML简介

##了解 XML

> XML代表可扩展标记语言。XML 是一种用于格式化文档以供人类和计算机读取的特定结构。如果这听起来非常普遍，那是因为它确实如此。

> 与大多数编程语言（甚至其他标记类型语言，如 HTML）不同，XML 对于其编码的数据的目的或类型没有任何意见，而是一组关于如何组织数据的规则。

> 让我们看一下 XML 的实际应用示例：

> > <drivers-license>
    <name>Mike Dane</name>
    <sex>Male</sex>
    <eye-color>Brown</eye-color>
    <organ-donor />
</drivers-license>

> 在上面的代码中，我们使用 XML 对驾驶执照信息进行编码。

> 为了有意义地表示我们的驾驶执照信息，我们希望指示我们所表示的信息类型（例如name）以及与该驾驶员相关的特定值（Mike Dane）。

> XML 允许我们通过使用标签轻松地做到这一点。


##容器标签
> 标签是 XML 中的特殊容器，我们可以在其中存储特定的信息。对于上面的姓名、性别和眼睛颜色字段，我们使用容器标签并将驾驶员的信息存储在其中。

> > <eye-color>Brown</eye-color>

> 容器标签由两部分组成：开始标签 ( <eye-color>) 和结束标签 ( </eye-color>)，其中包含元素名称 ( eye-color)。

> 上面代码中的元素名称eye-color放置在小于和大于符号内，用于定义标签内包含的信息类型。

> Brown通过以这种方式编码的信息，计算机程序可以解析 XML 文档，并通过查看容器标签内部来确定驾驶员眼睛的颜色eye-color。


##用于分组的标签
> 我们还可以使用这些容器标签将相关数据分组在一起。

> > <drivers-license>
    <name>Mike Dane</name>
    <sex>Male</sex>
     ...
</drivers-license>

> 请注意，在我们的驾驶执照文档中，我们还定义了一个<drivers-license>...</drivers-license>容器标签，其中包含其他更具体的元素。这是一种常见的做法，通常用于将相关数据包装成组。

> 理论上，我们可能有一个 xml 文档，其中存储了数百个驾驶执照，每个驾驶执照都包含在一个<drivers-license>标签中。

> 我们可以对驾驶员姓名字段执行类似的操作：

> > <drivers-license>
    <name>Mike Dane</name>
    ...
</drivers-license>

> <name></name>我们将使用姓名标签作为分组容器，并为名字和姓氏创建单独的标签，而不是将他们的名字和姓氏存储在同一个标​​签中：

> > <drivers-license>
    <name>
        <first>Mike</first>
        <last>Dane</last>
    </name>
    ...
</drivers-license>

> 在上面的示例中，我们现在有三个嵌套级别：drivers-license-> name-> first/last。这是 XML 的伟大之处之一，它不仅对于存储数据很有用，而且对于保留数据之间的层次关系也很有用。