sh -c "$(curl -fsSL https://raw.github.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"
cp ./zshrc ~/.zshrc

cp ./vimrc.local ~/.vimrc.local
cp ./vimrc.local.plugins ~/.vimrc.local.plugins
cp ./vimrc.local.before ~/.vimrc.local.before
curl vimfiles.luan.sh/install | bash

cp ./tmux.conf ~/.tmux.conf

