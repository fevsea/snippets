# Prevent apache2 to be stasrted automatically
sudo update-rc.d apache2 disable   #enable

#Stress gpu (nvidia)
__GL_SYNC_TO_VBLANK=0 glxgears
