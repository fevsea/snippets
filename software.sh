echo "Updating package list"
sudo apt update

echo "Upgrading packeges"
sudo apt upgrade -y


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
sudo apt install -y  git lm-sensors openssh-server openssh-client tmux hardinfo curl wireshark-qt aircrack-ng nmap

echo "Instaling ides"
#Sublime atom
echo "Installing atom"
curl -L https://packagecloud.io/AtomEditor/atom/gpgkey | sudo apt-key add -
sudo sh -c 'echo "deb [arch=amd64] https://packagecloud.io/AtomEditor/atom/any/ any main" > /etc/apt/sources.list.d/atom.list'
sudo apt-get update
sudo apt-get install -y atom
sudo snap install pycharm-professional --classic

echo "Installing random stuff"
sudo apt install -y sl cowsay cmatrix lolcat steam
sudo pip3 install thefuck
echo "eval $(thefuck --alias)" >> ~/.bashrc
source ~/.bashrc


######################

#UPCNet
#sudo apt update
#sudo apt-get install -y libc6-i386 lib32z1
# https://serveistic.upc.edu/ca/upclink/documentacio/manual-ubuntu

#alias wake="sudo etherwake -i enp3s0 00:21:cc:b7:dd:14"
#sudo dpkg -i ps-pulse-linux-8*-ubuntu-debian-installer.deb
#sudo apt-get install -y libwebkitgtk-1.0-0:i386
#sudo apt-get install -y libproxy1-plugin-gsettings:i386
#sudo apt-get install -y libproxy1-plugin-webkit:i386
#sudo apt-get install -y libdconf1:i386
#sudo apt-get install -y dconf-gsettings-backend:i386
#https://vpn.upc.edu/estudiants
