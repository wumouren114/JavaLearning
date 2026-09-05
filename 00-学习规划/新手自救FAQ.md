# 新手自救 FAQ（P0~P1 阶段专用）

> 原则：遇到问题**先花 5 分钟查这份表** → 还解决不了 → 复制完整报错发给老师。
> 版本 v1（随学习阶段持续补充）。

## 一、IDEA 操作类

**Q：绿色三角 ▶️ 是灰色的，点不了？**
A：先单击一下代码窗口（让光标进到代码里），再按 Shift+F10。还不行就检查：文件里是不是没有 `main` 方法了，或者代码顶部有红色报错（先看报错）。

**Q：找不到 Terminal 标签？**
A：IDEA 最底部的工具条有 `Terminal`；没有就按两次 `Shift` 键弹出搜索框，输入 Terminal 回车。

**Q：运行结果（输出）显示在哪？**
A：IDEA 底部 `Run` 窗口（和 Terminal 相邻）。点绿三角后它会自动弹出。

**Q：代码里的中文变成乱码/问号了？**
A：多半是文件编码问题：File → Settings → Editor → File Encodings，把 Global/Project 都设为 UTF-8，然后重开文件。

## 二、命令行报错类

**Q：提示 "'java' 不是内部或外部命令" 或 "java: command not found"？**
A：JDK 没加进系统 PATH。
1. 找到 JDK 安装位置（一般是 `C:\Program Files\Eclipse Adoptium\jdk-17.0.x.x`）
2. Windows 搜索"编辑系统环境变量" → 环境变量 → 在 **Path** 上点编辑 → 新建 → 填入上面的 `...\bin` 路径
3. 确定后**重开终端**，再输 `java -version` 验证
（懒得手配就让老师给你一步到位的命令）

**Q：报错 `cannot find symbol`？**
A：用了不存在的名字——检查拼写、大小写、有没有 import、类名和文件名是否一致。

**Q：报错 `';' expected`？**
A：少分号了。看报错提示的行号，行尾补 `;`。

**Q：报错 `variable xxx might not have been initialized`？**
A：变量声明了但没赋值就使用。先赋值再用。

**Q：报错 `incompatible types` / `possible lossy conversion`？**
A：类型不匹配（如 double 直接赋给 int）。需要强转或改类型，详见第 1 课 §6。

**Q：编译报错但代码肉眼看着没问题？？**
A：**检查标点是不是全角**！中文输入法状态下打的 `；`（全角分号）、`“”`（中文引号）和英文的 `;` `"` 长得几乎一样，编译器只认半角。这大概是新手第一大坑。写代码时把输入法切到英文模式。

## 三、编码与乱码类

**Q：终端运行 java 程序，中文输出乱码？**
A：Windows 控制台编码问题，代码没毛病。两个办法：
1. 终端先敲 `chcp 65001` 回车，再运行 `java -Dfile.encoding=UTF-8 -cp out 类名`
2. 直接用 IDEA 的运行窗口看结果
别在这上面耗超过 10 分钟。

**Q：javac 编译时报"编码 GBK 的不可映射字符"？**
A：源码是 UTF-8 而编译器按 GBK 读。编译命令加 `-encoding UTF-8`（讲义命令已带）。

## 四、Git / GitHub 类

**Q：push 时提示要账号密码，输了密码不对？**
A：GitHub 早就不支持密码了，要用**令牌（token）**：GitHub 头像 → Settings → Developer settings → Personal access tokens → Generate new token → 勾 repo → 生成后复制 `ghp_` 开头那串，粘贴到密码框。

**Q：`git remote add origin xxx` 报 already exists？**
A：仓库已登记过，改用 `git remote set-url origin 你的新地址`。

**Q：push 被拒绝（rejected）？**
A：远程仓库有本地没有的提交。新手常见原因：建仓库时勾了 README。解决：`git pull origin main --allow-unrelated-histories` 后再 push；搞不定就重来（仓库刚建没内容，删掉重建最快）。

**Q：不小心把 .idea 之类提交上去了？**
A：仓库根目录的 `.gitignore` 已配好（老师配的）。若已提交：`git rm -r --cached .idea` 再 commit+push。

## 五、学习节奏类

**Q：一个问题卡多久该求助？**
A：自己读报错 + 查表合计 **30 分钟**内没进展 → 发老师。超过 2 天卡住不解决是红线。

**Q：要不要记笔记？**
A：要，但**用自己的话**写（模板在 `01-JavaSE/我的笔记/`）。写不出 = 没懂。

**Q：看视频还是自己敲？**
A：先跟着敲一遍，再**关掉视频自己重写一遍**。只看不敲等于白看。

**Q：今天太累了，能休息吗？**
A：能，休息一天不丢人。但**第二天必须补上**；连续断 3 天要警惕（回来找老师重新上发条）。
