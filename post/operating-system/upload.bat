@echo off
git pull origin main
git add .
git commit -m "���O�W�� %DATE% %TIME%"
git push -u origin main
pause
exit
