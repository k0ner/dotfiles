brew install fish
curl -L https://get.oh-my.fish | fish
omf install simple-ass-prompt
omf theme simple-ass-prompt

mkdir -p ~/.config/fish/
cp ./config.fish ~/.config/fish/

cp ./vimrc.local ~/.vimrc.local
cp ./vimrc.local.plugins ~/.vimrc.local.plugins
cp ./vimrc.local.before ~/.vimrc.local.before
curl vimfiles.luan.sh/install | bash

cp ./tmux.conf ~/.tmux.conf
