#git commands
:<<EOF
git init
git remote -v
git remote add origin git@github.com:mu-yun/SpringCloud.git
git log
git reset --soft ...
git restore
git branch
git checkout dev
git branch --set-upstream-to=origin/dev dev
git merge dev

#撤消上一次已经push的提交
git reset --soft HEAD^ (HEAD^表示上一个版本)
git push origin dev --force
EOF