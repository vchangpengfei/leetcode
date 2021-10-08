# 初始化项目
git init

# 将已有的项目文件全部提交
git add *
git commit -m "first commit"

# 添加到远程仓库 这个仓库需要在github上提前创建
git remote add origin git@github.com:vchangpengfei/leetcode.git

# 推送分支
git push -u origin master
