# Acces abd on Ubuntu
echo 'export PATH=$PATH:$HOME"/Android/Sdk/platform-tools"' >> ~/.bashrc
echo 'export PATH=$PATH:$HOME"/Android/Sdk/emulator"' >> ~/.bashrc

# Manually start emulated device with dns
emulator -avd emulated-27 -dns-server 8.8.8.8 -verbose
