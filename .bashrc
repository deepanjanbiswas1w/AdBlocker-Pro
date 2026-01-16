# ===== CUSTOM ALIASES =====
# AdGuard DNS Proxy (তোর আসল ট্রাফিক কন্ট্রোলার)
alias s='cloudflared proxy-dns --address 127.0.0.1 --port 5053 --upstream https://dns.adguard.com/dns-query'

# ফাইল এডিট করার শর্টকাট
alias n='nano ~/.bashrc'

# লিঙ্ক পাঠানোর শর্টকাট
alias dl='_dl(){ echo "$1" >> ~/yt-guard/links.txt && echo "🚀 ভিডিও লিঙ্ক পাঠানো হয়েছে!"; }; _dl'
alias m='_m(){ echo "$1" >> ~/yt-guard/links.txt && echo "🎵 অডিও লিঙ্ক পাঠানো হয়েছে!"; }; _m'

# তোর প্রিয় সেই ক্লিয়ার কমান্ড
alias kc='clear'
alias c='clear'

# মাস্টার কমান্ড (DNS + তোর আসল টারমাক্স বট)
alias rd='s & sleep 1 && bash ~/darowan.sh'
# ==========================
export PATH=$PATH:/data/data/com.termux/files/home/MyBeastApp/gradle-8.1/bin
export ANDROID_HOME=$HOME/android-sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools
