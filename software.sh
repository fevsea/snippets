echo "Updating package list"
sudo apt update

echo "Upgrading packeges"
sudo apt upgrade -y

#Sublime text 3
echo "Installing sublime text"
sudo add-apt-repository -y ppa:webupd8team/sublime-text-3
sudo apt update
sudo apt-get install -y sublime-text-installer

#Firefox for developers
echo "Installing Firefox for developers"
sudo add-apt-repository -y ppa:ubuntu-mozilla-daily/firefox-aurora
sudo apt update
sudo apt-get -y install firefox

# TLP battery saving
#sudo add-apt-repository -y ppa:linrunner/tlp
#sudo apt-get install -y tlp tlp-rdw
#Only thinkpad
#sudo apt-get install -y tp-smapi-dkms acpi-call-tools
#sudo tlp start

#VLC
echo "Installing VLC"
sudo apt install -y vlc browser-plugin-vlc libavcodec-extra
#Blender
echo "Installing Blender"
sudo apt install -y blender
#Virtualbox
echo "Installing Virtualbox"
sudo apt install -y virtualbox
#Mocp
echo "Installing Mocp"
sudo apt install -y moc

# OpenSCAD
sudo add-apt-repository -y  ppa:openscad/releases
sudo apt-get update
sudo apt-get install -y openscad

#gparted
echo "Installing Gparted"
sudo apt install -y gparted

echo "Installing python"
sudo apt install -y python3 python3-pip ipython3

echo "Installing dev tools"
sudo apt install -y  git lm-sensors openssh-server openssh-client tmux hardinfo

echo "Installing random stuff"
sudo apt install -y sl cowsay cowsay lolcat
sudo pip3 install thefuck
echo "eval $(thefuck --alias)" >> ~/.bashrc
source ~/.bashrc

#alias wake="sudo etherwake -i enp3s0 00:21:cc:b7:dd:14"
