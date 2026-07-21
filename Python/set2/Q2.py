# 2. Write a program which takes number of millimeter and converts
# them into meters, feets, inches, centimeter and then millimeter

milli=int(input("Enter measurement in millimeter:"))
m=milli*0.001
f=milli*0.00328084
inch=milli*0.03937008
cm=milli*0.1
print(f"{m:.3f} meters {f:.3f} feets {inch:.3f} inches {cm:.3f} centimeters {milli:.3f} millimeters")