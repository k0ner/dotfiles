if not [ $TMUX ]
  tmux
end
set -gx PATH $PATH ~/.bin

set -gx JAVA_HOME (/usr/libexec/java_home)

alias ggpull='git pull origin (__git.current_branch)'
