# 多Release仓库的问题
- 仓库经常遇到的一个问题是同一个版本的库在不同仓库不一致，甚至有的仓库的版本是有Ｂug的。

# 如何从多个仓库下载并检查ＰＯＭ与ＪＡＲ
- 使用Ｃurl命令从不同Repository分别下载POM和JAR进行比对。
- 使用mvn命令配合定制的POM文件（只包含要检查的依赖），配合面向不同仓库的setting文件（配置不同的Local Repository路径），从而将该依赖从不同仓库下载的不同的Local Repository路径。

# Commands
- mvn help:effective-pom
- mvn -s ./maven-setting-for-nexus-a.xml help:effective-settings
- mvn -s ./maven-setting-for-nexus-a.xml dependency:tree -Dverbose=true
