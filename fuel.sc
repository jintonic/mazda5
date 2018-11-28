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
color 1 = @white;@black
color 7 = @white;@blue
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
let A39 = @dts(2017,6,10)
fmt A39 "%F"
let B39 = 11073
let C39 = 11.524
let D39 = (B39-@nval("B",@myrow-1))/C39
let E39 = 2.199
let F39 = 25.34
let G39 = @nval("G",@myrow-1)+F39
let A40 = @dts(2017,6,10)
fmt A40 "%F"
let B40 = 11275
let C40 = 8.22
let D40 = (B40-@nval("B",@myrow-1))/C40
let E40 = 2.179
let F40 = 17.91
let G40 = @nval("G",@myrow-1)+F40
let A41 = @dts(2017,6,11)
fmt A41 "%F"
let B41 = 11552
let C41 = 10.426
let D41 = (B41-@nval("B",@myrow-1))/C41
let E41 = 1.779
let F41 = 18.55
let G41 = @nval("G",@myrow-1)+F41
let A42 = @dts(2017,6,11)
fmt A42 "%F"
let B42 = 11768
let C42 = 9.571
let D42 = (B42-@nval("B",@myrow-1))/C42
let E42 = 2.199
let F42 = 21.05
let G42 = @nval("G",@myrow-1)+F42
let A43 = @dts(2017,6,17)
fmt A43 "%F"
let B43 = 12054
let C43 = 8
let D43 = (B43-@nval("B",@myrow-1))/C43
let E43 = 1.779
let F43 = 19.5
let G43 = @nval("G",@myrow-1)+F43
let A44 = @dts(2017,6,17)
fmt A44 "%F"
let B44 = 12354
let C44 = 10.96
let D44 = (B44-@nval("B",@myrow-1))/C44
let E44 = 1.779
let F44 = 19.5
let G44 = @nval("G",@myrow-1)+F44
let A45 = @dts(2017,6,18)
fmt A45 "%F"
let B45 = 12681
let C45 = 12.503
let D45 = (B45-@nval("B",@myrow-1))/C45
let E45 = 2.159
let F45 = 26.99
let G45 = @nval("G",@myrow-1)+F45
let A46 = @dts(2017,6,18)
fmt A46 "%F"
let B46 = 12998
let C46 = 11.887
let D46 = (B46-@nval("B",@myrow-1))/C46
let E46 = 2.109
let F46 = 25.07
let G46 = @nval("G",@myrow-1)+F46
let A47 = @dts(2017,9,28)
fmt A47 "%F"
let B47 = 13274
let C47 = 12.929
let D47 = (B47-@nval("B",@myrow-1))/C47
let E47 = 2.399
let F47 = 31.02
let G47 = @nval("G",@myrow-1)+F47
let A48 = @dts(2017,11,11)
fmt A48 "%F"
let B48 = 13522
let C48 = 11.773
let D48 = (B48-@nval("B",@myrow-1))/C48
let E48 = 2.409
let F48 = 28.36
let G48 = @nval("G",@myrow-1)+F48
let A49 = @dts(2018,1,9)
fmt A49 "%F"
let B49 = 13771
let C49 = 13.53
let D49 = (B49-@nval("B",@myrow-1))/C49
let E49 = 2.369
let F49 = 31.21
let G49 = @nval("G",@myrow-1)+F49
let A50 = @dts(2018,2,10)
fmt A50 "%F"
let B50 = 13980
let C50 = 10.934
let D50 = (B50-@nval("B",@myrow-1))/C50
let E50 = 2.509
let F50 = 27.43
let G50 = @nval("G",@myrow-1)+F50
let A51 = @dts(2018,3,9)
fmt A51 "%F"
let B51 = 14208
let C51 = 14.112
let D51 = (B51-@nval("B",@myrow-1))/C51
let E51 = 2.409
let F51 = 32.6
let G51 = @nval("G",@myrow-1)+F51
rightstring H51 = "cold run all time"
let A52 = @dts(2018,3,31)
fmt A52 "%F"
let B52 = 14376
let C52 = 7.273
let D52 = (B52-@nval("B",@myrow-1))/C52
let E52 = 2.369
let F52 = 17.23
let G52 = @nval("G",@myrow-1)+F52
let A53 = @dts(2018,5,1)
fmt A53 "%F"
let B53 = 14636
let C53 = 13.02
let D53 = (B53-@nval("B",@myrow-1))/C53
let E53 = 2.579
let F53 = 33.58
let G53 = @nval("G",@myrow-1)+F53
let A54 = @dts(2018,6,9)
fmt A54 "%F"
let B54 = 15067
let C54 = 5.638
let D54 = (B54-@nval("B",@myrow-1))/C54
let E54 = 2.699
let F54 = 15.22
let G54 = @nval("G",@myrow-1)+F54
let A55 = @dts(2018,7,25)
fmt A55 "%F"
let B55 = 15805
let C55 = 11.094
let D55 = (B55-@nval("B",@myrow-1))/C55
let E55 = 2.629
let F55 = 29.17
let G55 = @nval("G",@myrow-1)+F55
let A56 = @dts(2018,7,26)
fmt A56 "%F"
let B56 = 16063
let C56 = 10.677
let D56 = (B56-@nval("B",@myrow-1))/C56
let E56 = 2.629
let F56 = 28.007
let G56 = @nval("G",@myrow-1)+F56
let A57 = @dts(2018,8,11)
fmt A57 "%F"
let B57 = 16346
let C57 = 11.826
let D57 = (B57-@nval("B",@myrow-1))/C57
let E57 = 2.559
let F57 = 30.26
let G57 = @nval("G",@myrow-1)+F57
let A58 = @dts(2018,8,18)
fmt A58 "%F"
let B58 = 16506
let C58 = 6.476
let D58 = (B58-@nval("B",@myrow-1))/C58
let E58 = 2.549
let F58 = 16.51
let G58 = @nval("G",@myrow-1)+F58
let A59 = @dts(2018,9,3)
fmt A59 "%F"
let B59 = 16756
let C59 = 9.496
let D59 = (B59-@nval("B",@myrow-1))/C59
let E59 = 2.599
let F59 = 24.68
let G59 = @nval("G",@myrow-1)+F59
let A60 = @dts(2018,9,15)
fmt A60 "%F"
let B60 = 16903
let C60 = 6.323
let D60 = (B60-@nval("B",@myrow-1))/C60
let E60 = 2.599
let F60 = 16.43
let G60 = @nval("G",@myrow-1)+F60
let A61 = @dts(2018,10,6)
fmt A61 "%F"
let B61 = 17166
let C61 = 11.927
let D61 = (B61-@nval("B",@myrow-1))/C61
let E61 = 2.759
let F61 = 32.91
let G61 = @nval("G",@myrow-1)+F61
let A62 = @dts(2018,10,26)
fmt A62 "%F"
let B62 = 17455
let C62 = 12.496
let D62 = (B62-@nval("B",@myrow-1))/C62
let E62 = 2.699
let F62 = 33.7
let G62 = @nval("G",@myrow-1)+F62
let A63 = @dts(2018,11,17)
fmt A63 "%F"
let B63 = 17648
let C63 = 10.408
let D63 = (B63-@nval("B",@myrow-1))/C63
let E63 = 2.189
let F63 = 22.78
let G63 = @nval("G",@myrow-1)+F63
let A64 = @dts(2018,11,23)
fmt A64 "%F"
let B64 = 17907
let C64 = 10.915
let D64 = (B64-@nval("B",@myrow-1))/C64
let E64 = 2.099
let F64 = 22.91
let G64 = @nval("G",@myrow-1)+F64
goto D57 A28
