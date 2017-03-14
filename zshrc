# Path to your oh-my-zsh installation.
export ZSH=$HOME/.oh-my-zsh

ZSH_THEME="sporty_256"

export UPDATE_ZSH_DAYS=14

plugins=(git mvn docker zsh-autosuggestions)

source $ZSH/oh-my-zsh.sh

export PATH=$PATH:~/.bin
export JAVA_HOME=`/usr/libexec/java_home`

if [ "$TMUX" = "" ]; then tmux; fi

[ -f ~/.fzf.zsh ] && source ~/.fzf.zsh
