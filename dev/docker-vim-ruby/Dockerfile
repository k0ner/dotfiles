FROM jare/vim-bundle

MAINTAINER k0ner <konradtendera@gmail.com>

# Get Ruby
RUN apk --update add ruby-dev ruby-doc ruby-rdoc ruby-irb

#get seeing_is_believing for ruby vim execution
RUN gem install seeing_is_believing

#add ruby plugins to vim
RUN cd /home/developer/bundle/ \
    && git clone --depth 1 https://github.com/vim-ruby/vim-ruby \
    && git clone --depth 1 https://github.com/t9md/vim-ruby-xmpfilter \
    && git clone --depth 1 https://github.com/hwartig/vim-seeing-is-believing

#add to .vimrc
RUN curl -s https://raw.githubusercontent.com/k0ner/dotfiles/master/vimrc >> /home/developer/.vimrc~ \
    && sh /util/tidy-viml /home/developer/.vimrc~
