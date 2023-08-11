#!/bin/bash

rm /tmp/simplechain-participants.ser
gnome-terminal -e "./simple-chain.sh 12345"
gnome-terminal -e "./simple-chain.sh 12346"
gnome-terminal -e "./simple-chain.sh 12347"
gnome-terminal -e "./monitor.sh"
