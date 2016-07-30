sh -c "$(curl -fsSL https://raw.github.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"
cp ./zshrc ~/.zshrc

curl vimfiles.luan.sh/install | bash

cp ./vimrc.local ~/.vimrc.local
cp ./tmux.conf ~/.tmux.conf

