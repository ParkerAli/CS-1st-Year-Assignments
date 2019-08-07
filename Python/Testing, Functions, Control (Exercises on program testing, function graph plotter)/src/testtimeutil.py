"""
>>> import timeutil
>>> timeutil.validate("934 a.m.")
False
>>> timeutil.validate("08:32 a.m.")
False
>>> timeutil.validate("6k:698 k.m.")
False
>>> timeutil.validate("10:12 a.m.")
True
>>> timeutil.validate("13:u9 a.m.")
False

"""
import doctest

doctest.testmod(verbose=True)