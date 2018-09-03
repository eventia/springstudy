@echo off
echo ==============================
echo [PROCESSING...] git pull
echo [PROCESSING...] git add --all .
if [%1] EQU [] (
echo [PROCESSING...] git commit -m "SpringLecture %date%"
) else (
echo [PROCESSING...] git commit -m "%*"
)
echo [PROCESSING...] git push
echo ==============================

git pull

echo [PROCESSING...] git add --all .
git add --all .
if [%1] EQU [] (
echo.
echo [PROCESSING...] git commit -m "SpringLecture %date%"
echo.
git commit -m "SpringLecture %date%"
) else (
echo.
echo [PROCESSING...] git commit -m "%*"
echo.
git commit -m "%*"
)
echo.
echo [PROCESSING...] git push
echo.
git push