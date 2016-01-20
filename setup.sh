sh -c "$(curl -fsSL https://raw.github.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"
cp ./zshrc ~/.zshrc

git clone http://github.com/luan/vimfiles.git ~/.vim
~/.vim/install

cp ./vimrc.local ~/.vimrc.local
cp ./tmux.conf ~/.tmux.conf

