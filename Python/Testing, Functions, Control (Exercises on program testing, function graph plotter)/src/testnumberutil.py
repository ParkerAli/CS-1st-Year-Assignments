"""
>>> import numberutil
>>> numberutil.aswords(0)
'zero'
>>> numberutil.aswords(6)
'six'
>>> numberutil.aswords(40)
'forty'
>>> numberutil.aswords(54)
'fifty four'
>>> numberutil.aswords(100)
'one hundred'
>>> numberutil.aswords(203)
'two hundred and three'
>>> numberutil.aswords(630)
'six hundred and thirty'
>>> numberutil.aswords(536)
'five hundred and thirty six'

"""
import doctest

doctest.testmod(verbose=True)