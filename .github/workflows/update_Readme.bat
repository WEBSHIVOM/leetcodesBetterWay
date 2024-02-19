@echo off
setlocal enabledelayedexpansion

rem Clear existing Java files section in README.md
powershell -Command "(Get-Content README.md) -replace '## Java Files\r?\n\r?\n', '## Java Files\r\n' | Set-Content README.md"

rem Define the base GitHub URL for your repository
set "github_base_url=https://github.com/WEBSHIVOM/leetcodesBetterWay/blob/main/src/main/java/"

rem Loop through all Java files in subdirectories and append links to README.md
for /r %%i in (*.java) do (
    set "file=%%~nxi"
    set "relative_path=%%~dpni"
    set "relative_path=!relative_path:~56,-1!"  rem Remove leading path up to "src\main\java\"
    set "relative_path=!relative_path:\=/"  rem Replace backslashes with forward slashes
    echo * [!file!](!github_base_url!!relative_path!!file!) >> README.md
)

echo "README updated with GitHub links to Java files."
