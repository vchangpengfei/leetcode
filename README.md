

# …or create a new repository on the command line
> echo "# leetcode" >> README.md 
> git init 
> git add README.md 
> git commit -m "first commit" 
> git branch -M main 
#添加到远程仓库 这个仓库需要在github上提前创建 
git remote add origin git@github.com:vchangpengfei/leetcode.git
git push -u origin main


# …or push an existing repository from the command line
git remote add origin git@github.com:vchangpengfei/leetcode.git
git branch -M main
git push -u origin main