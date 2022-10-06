#!/usr/bin/python3
# vim: set fileencoding=utf8 :

import matplotlib

import matplotlib.pyplot as plt

import numpy as np


if __name__ == '__main__':

    fig, ax = plt.subplots()

    x = np.array(range(1,21), dtype=int)

    y = np.power(2, x)
    z = np.power(x, 2)

    plt.yscale('linear')

    ax.plot(x, y, label='O(2^n), exponentiel, rarement utilisable')
    ax.plot(x, z, label=u'O(n^2), quadratique, pas efficace')

    ax.legend()

    xticks = [tick for tick in x if tick%2==0]

    plt.xticks(xticks)


    #plt.xticks(rotation=-45)

    #plt.xticks(annees, [annee if int(annee)%step_x==0 else '' for annee in annees])

    #ax.set(xlabel=titre_x, ylabel=titre_y,
                   #title=titre)

    ax.grid()

    fig.set_size_inches(6, 10)

    fig.savefig("theorie_exp.png")

    exit()

