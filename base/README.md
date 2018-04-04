# Kserno's base project

This is a basic library that should be included in every starting Java project running MVP architecture.

This project contains base classes which are very usable in future projects,
also in [dependencies file](./dependencies/dependencies.gradle) there are defined various groups of useful dependencies and versions,
There is still a lot of work to be done, for example adding link to project detailed description of the libraries,
but they will be noted in the issues of the git repository and hopefully finished later on.

So basic description of the classes:

## BaseActivity

Base class for activities it does the whole lifecycle of BK and Presenter for you, you just have to implement the given methods.


## BaseFragment

Base class for fragments it does the whole lifecycle of BK and Presenter for you, you just have to implement the given methods.

## BasePresenter

This is base for every new presenter also make sure when creating new Presnter always create according interface Contract to it
containing interfaces for Presenter and Screen, Presenter Interface has to extend IBasePresenter interface if you want to reference Presenter with only interface,
otherwise if you are ok with referencing it directly you don't have to the Contract is just to make a file containig the whole communication between Screen and Presenter.

## BaseRecyclerAdapter

THis class contains useful methods like adding listeners to adapter or adding data without having to use notifyDatasetChanged and so on, also reduces boilerplate when used wiht
BaseViewHolder to around half when implementing a list
