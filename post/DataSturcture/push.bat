@echo off
git pull origin main
git add .
git commit -m "%Time% %DATE%"
git push -u origin main
pause
