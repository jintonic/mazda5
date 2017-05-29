# This data file was generated by the Spreadsheet Calculator.
# You almost certainly shouldn't edit it.

set numeric color
format 5 = "%F"
format 6 = " %y-%m-%d %R"
format A 10 2 5
format B 7 0 0
format C 7 3 0
format D 11 2 0
format E 6 3 0
format F 6 2 0
rightstring A0 = "date"
rightstring B0 = "milage"
rightstring C0 = "added"
rightstring D0 = "efficiency"
rightstring E0 = "price"
rightstring F0 = "cost"
rightstring G0 = "total"
let A1 = @dts(2014,9,19)
fmt A1 "%F"
let B1 = 391
let C1 = 12
let D1 = 25
let E1 = 3.4
let F1 = 40.8
let G1 = @nval("G",@myrow-1)+F1
let A2 = @dts(2014,10,3)
fmt A2 "%F"
let B2 = 692
let C2 = 12
let D2 = (B2-@nval("B",@myrow-1))/C2
let E2 = 3.4
let F2 = 40.8
let G2 = @nval("G",@myrow-1)+F2
let A3 = @dts(2014,10,12)
fmt A3 "%F"
let B3 = 1022
let C3 = 13.069
let D3 = (B3-@nval("B",@myrow-1))/C3
let E3 = 2.999
let F3 = 39.19
let G3 = @nval("G",@myrow-1)+F3
let A4 = @dts(2014,10,31)
fmt A4 "%F"
let B4 = 1259
let C4 = 12.155
let D4 = (B4-@nval("B",@myrow-1))/C4
let E4 = 2.879
let F4 = 34.99
let G4 = @nval("G",@myrow-1)+F4
let A5 = @dts(2014,11,15)
fmt A5 "%F"
let B5 = 1450
let C5 = 8.155
let D5 = (B5-@nval("B",@myrow-1))/C5
let E5 = 2.879
let F5 = 24.29
let G5 = @nval("G",@myrow-1)+F5
rightstring H5 = "fake record to recover eff"
let A6 = @dts(2014,11,28)
fmt A6 "%F"
let B6 = 1726
let C6 = 11.355
let D6 = (B6-@nval("B",@myrow-1))/C6
let E6 = 2.499
let F6 = 28.38
let G6 = @nval("G",@myrow-1)+F6
let A7 = @dts(2015,1,8)
fmt A7 "%F"
let B7 = 2226
let C7 = 19.355
let D7 = (B7-@nval("B",@myrow-1))/C7
let E7 = 2.499
let F7 = 48.36
let G7 = @nval("G",@myrow-1)+F7
rightstring H7 = "fake record to recover eff"
let A8 = @dts(2015,2,2)
fmt A8 "%F"
let B8 = 2605
let C8 = 14.088
let D8 = (B8-@nval("B",@myrow-1))/C8
let E8 = 1.849
let F8 = 25.35
let G8 = @nval("G",@myrow-1)+F8
let A9 = @dts(2015,3,27)
fmt A9 "%F"
let B9 = 3104
let C9 = 17.439
let D9 = (B9-@nval("B",@myrow-1))/C9
let E9 = 2.287
let F9 = 39.23
let G9 = @nval("G",@myrow-1)+F9
rightstring H9 = "combined with 2015-02-28"
let A10 = @dts(2015,4,26)
fmt A10 "%F"
let B10 = 3418
let C10 = 15.149
let D10 = (B10-@nval("B",@myrow-1))/C10
let E10 = 2.299
let F10 = 34.45
let G10 = @nval("G",@myrow-1)+F10
let A11 = @dts(2015,5,23)
fmt A11 "%F"
let B11 = 3762
let C11 = 15.816
let D11 = (B11-@nval("B",@myrow-1))/C11
let E11 = 2.472
let F11 = 38.94
let G11 = @nval("G",@myrow-1)+F11
rightstring H11 = "combined with 2015-05-20"
let A12 = @dts(2015,5,30)
fmt A12 "%F"
let B12 = 4211
let C12 = 18.466
let D12 = (B12-@nval("B",@myrow-1))/C12
let E12 = 2.692
let F12 = 49.71
let G12 = @nval("G",@myrow-1)+F12
rightstring H12 = "combined"
let A13 = @dts(2015,5,31)
fmt A13 "%F"
let B13 = 4687
let C13 = 18.102
let D13 = (B13-@nval("B",@myrow-1))/C13
let E13 = 2.737
let F13 = 46.49
let G13 = @nval("G",@myrow-1)+F13
rightstring H13 = "combined"
let A14 = @dts(2015,6,14)
fmt A14 "%F"
let B14 = 4950
let C14 = 11
let D14 = (B14-@nval("B",@myrow-1))/C14
let E14 = 2.439
let F14 = 26.82
let G14 = @nval("G",@myrow-1)+F14
rightstring H14 = "fake record to recover eff"
let A15 = @dts(2015,6,28)
fmt A15 "%F"
let B15 = 5214
let C15 = 10.249
let D15 = (B15-@nval("B",@myrow-1))/C15
let E15 = 2.439
let F15 = 25
let G15 = @nval("G",@myrow-1)+F15
let A16 = @dts(2015,7,7)
fmt A16 "%F"
let B16 = 5477
let C16 = 10.914
let D16 = (B16-@nval("B",@myrow-1))/C16
let E16 = 2.549
let F16 = 27.82
let G16 = @nval("G",@myrow-1)+F16
let A17 = @dts(2015,7,19)
fmt A17 "%F"
let B17 = 5717
let C17 = 10.794
let D17 = (B17-@nval("B",@myrow-1))/C17
let E17 = 2.499
let F17 = 26.97
let G17 = @nval("G",@myrow-1)+F17
let A18 = @dts(2015,8,8)
fmt A18 "%F"
let B18 = 6024
let C18 = 12.726
let D18 = (B18-@nval("B",@myrow-1))/C18
let E18 = 2.549
let F18 = 32.44
let G18 = @nval("G",@myrow-1)+F18
let A19 = @dts(2015,9,6)
fmt A19 "%F"
let B19 = 6287
let C19 = 12.963
let D19 = (B19-@nval("B",@myrow-1))/C19
let E19 = 2.299
let F19 = 29.8
let G19 = @nval("G",@myrow-1)+F19
let A20 = @dts(2015,9,23)
fmt A20 "%F"
let B20 = 6585
let C20 = 12.466
let D20 = (B20-@nval("B",@myrow-1))/C20
let E20 = 2.139
let F20 = 26.66
let G20 = @nval("G",@myrow-1)+F20
let A21 = @dts(2015,10,3)
fmt A21 "%F"
let B21 = 6723
let C21 = 7.274
let D21 = (B21-@nval("B",@myrow-1))/C21
let E21 = 2.099
let F21 = 7.274
let G21 = @nval("G",@myrow-1)+F21
let A22 = @dts(2015,10,11)
fmt A22 "%F"
let B22 = 6867
let C22 = 5.091
let D22 = (B22-@nval("B",@myrow-1))/C22
let E22 = 2.029
let F22 = 15.27
let G22 = @nval("G",@myrow-1)+F22
let A23 = @dts(2015,10,30)
fmt A23 "%F"
let B23 = 7132
let C23 = 12.216
let D23 = (B23-@nval("B",@myrow-1))/C23
let E23 = 1.979
let F23 = 24.18
let G23 = @nval("G",@myrow-1)+F23
let A24 = @dts(2015,11,14)
fmt A24 "%F"
let B24 = 7402
let C24 = 11.665
let D24 = (B24-@nval("B",@myrow-1))/C24
let E24 = 1.989
let F24 = 23.2
let G24 = @nval("G",@myrow-1)+F24
let A25 = @dts(2015,11,29)
fmt A25 "%F"
let B25 = 7649
let C25 = 10.491
let D25 = (B25-@nval("B",@myrow-1))/C25
let E25 = 1.899
let F25 = 19.92
let G25 = @nval("G",@myrow-1)+F25
let A26 = @dts(2016,1,3)
fmt A26 "%F"
let B26 = 7915
let C26 = 12.493
let D26 = (B26-@nval("B",@myrow-1))/C26
let E26 = 1.759
let F26 = 21.98
let G26 = @nval("G",@myrow-1)+F26
let A27 = @dts(2016,1,18)
fmt A27 "%F"
let B27 = 8187
let C27 = 12.855
let D27 = (B27-@nval("B",@myrow-1))/C27
let E27 = 1.649
let F27 = 21.2
let G27 = @nval("G",@myrow-1)+F27
let A28 = @dts(2016,3,27)
fmt A28 "%F"
let B28 = 8424
let C28 = 16.726
let D28 = (B28-@nval("B",@myrow-1))/C28
let E28 = 1.903
let F28 = 31.94
let G28 = @nval("G",@myrow-1)+F28
rightstring H28 = "combined result"
let A29 = @dts(2016,4,15)
fmt A29 "%F"
let B29 = 8677
let C29 = 10.685
let D29 = (B29-@nval("B",@myrow-1))/C29
let E29 = 1.889
let F29 = 20.18
let G29 = @nval("G",@myrow-1)+F29
rightstring H29 = "fake record to recover eff"
let A30 = @dts(2016,5,4)
fmt A30 "%F"
let B30 = 8877
let C30 = 8.685
let D30 = (B30-@nval("B",@myrow-1))/C30
let E30 = 1.889
let F30 = 16.41
let G30 = @nval("G",@myrow-1)+F30
let A31 = @dts(2016,5,18)
fmt A31 "%F"
let B31 = 8980
let C31 = 6.115
let D31 = (B31-@nval("B",@myrow-1))/C31
let E31 = 2.259
let F31 = 13.81
let G31 = @nval("G",@myrow-1)+F31
rightstring H31 = "fake mileage to recover eff"
let A32 = @dts(2016,8,9)
fmt A32 "%F"
let B32 = 9183
let C32 = 12.329
let D32 = (B32-@nval("B",@myrow-1))/C32
let E32 = 1.899
let F32 = 23.41
let G32 = @nval("G",@myrow-1)+F32
let A33 = @dts(2016,11,1)
fmt A33 "%F"
let B33 = 9432
let C33 = 13.323
let D33 = (B33-@nval("B",@myrow-1))/C33
let E33 = 2.099
let F33 = 27.96
let G33 = @nval("G",@myrow-1)+F33
let A34 = @dts(2016,12,31)
fmt A34 "%F"
let B34 = 9704
let C34 = 15.869
let D34 = (B34-@nval("B",@myrow-1))/C34
let E34 = 2.135
let F34 = 34.77
let G34 = @nval("G",@myrow-1)+F34
rightstring H34 = " combined with 2016-12-20"
let A35 = @dts(2017,2,4)
fmt A35 "%F"
let B35 = 9939
let C35 = 13.7
let D35 = (B35-@nval("B",@myrow-1))/C35
let E35 = 2.169
let F35 = 29.02
let G35 = @nval("G",@myrow-1)+F35
let A36 = @dts(2017,3,17)
fmt A36 "%F"
let B36 = 10187
let C36 = 13.526
let D36 = (B36-@nval("B",@myrow-1))/C36
let E36 = 2.169
let F36 = 29.34
let G36 = @nval("G",@myrow-1)+F36
let A37 = @dts(2017,5,6)
fmt A37 "%F"
let B37 = 10477
let C37 = 13.127
let D37 = (B37-@nval("B",@myrow-1))/C37
let E37 = 2.049
let F37 = 26.9
let G37 = @nval("G",@myrow-1)+F37
let A38 = @dts(2017,5,17)
fmt A38 "%F"
let B38 = 10786
let C38 = 11.883
let D38 = (B38-@nval("B",@myrow-1))/C38
let E38 = 2.119
let F38 = 25.18
let G38 = @nval("G",@myrow-1)+F38
goto H14 A0
