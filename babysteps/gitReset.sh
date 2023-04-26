#!/usr/bin/zsh

cd ~/WS/tdd || return 99

if [ "$(git log --pretty=format:%ct -1)" -lt "$(date +%s -d '2 minutes ago')" ]; then
#  git stash; # Did not work since stash was cleared out because of the reset
  git reset --hard HEAD;
#  git stash list --since='1 hour ago' | cut -d: -f1 | xargs git stash drop
fi
