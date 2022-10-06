#!/usr/bin/python3
# vim: set fileencoding=utf8 :

import matplotlib

import matplotlib.pyplot as plt

import numpy as np


if __name__ == '__main__':

    fig, ax = plt.subplots()

    x = np.array(range(1,20), dtype=int)

    y = np.log(x)
    z = np.array(x)

    plt.yscale('linear')

    ax.plot(x, y, label=u'O(log(n)), logarithmique, très efficace')
    ax.plot(x, z, label=u'O(n), linéaire, efficace')

    ax.legend()

    xticks = [tick for tick in x if tick%2==0]

    plt.xticks(xticks)


    #plt.xticks(rotation=-45)

    #plt.xticks(annees, [annee if int(annee)%step_x==0 else '' for annee in annees])

    #ax.set(xlabel=titre_x, ylabel=titre_y,
                   #title=titre)

    ax.grid()

    fig.set_size_inches(8, 4)

    fig.savefig("theorie_log.png")

    exit()

