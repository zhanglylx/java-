'''
Created on 2017年9月1日

@author: Administrator
'''
# -*- coding: utf-8 -*-
import os
import sys
import math
import string
import random
import pandas
import time

import pylab 
import numpy as np
import matplotlib.pyplot as plt

from public_fun import *


    
file_list = get_file_list( sys.argv[1] )

floor    = int(sys.argv[2])


errs = []

for file in file_list:
    data = pandas.read_csv( file )
    co = data.columns.tolist() 
    data.columns = [ i.strip(' ') for i in co ]
    
    
    foo = int(data.real_floor.tolist()[0])
    
    if floor != 0:
    
        if floor != foo:
            continue

    
    #读取offset列
    l = data.error.tolist()[5:]

    l = [ iii for iii in l if iii < 100 ]

    errs += l
    
    
    
    
    ll = sorted( l ),
    
    #print file,  sum(l)/len(l)
    
    for index in range(0, len(ll)):
        if index*1.0/len(ll)>0.8:
            print (ll[index])
            break
    
if len(errs) != 0:    
    so = sorted( errs )
    yyy = [ index*100.0/len(so) for index in range(0, len(so) )]
    plt.plot( so, yyy , 'bx-', label = 'line 1')

plt.show()