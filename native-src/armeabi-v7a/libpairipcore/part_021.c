// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 401-420
// ============================================================

// ============================================================
// Function #401
// Name: FUN_000236d0
// Address: 000236d0
// JNI: NO
// ============================================================


void FUN_000236d0(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #402
// Name: FUN_0002372c
// Address: 0002372c
// JNI: NO
// ============================================================


void FUN_0002372c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #403
// Name: FUN_0002373a
// Address: 0002373a
// JNI: NO
// ============================================================


void FUN_0002373a(int param_1,undefined4 param_2)

{
  (**(code **)(**(int **)(param_1 + 8) + 0x10))(*(int **)(param_1 + 8),param_2);
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10));
  return;
}




// ============================================================
// Function #404
// Name: FUN_0002375a
// Address: 0002375a
// JNI: NO
// ============================================================


void FUN_0002375a(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #405
// Name: FUN_00023768
// Address: 00023768
// JNI: NO
// ============================================================


void FUN_00023768(int param_1,int *param_2,int *param_3)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 0x1d;
  iVar2 = *param_3;
  *piVar1 = DAT_000237a0 + 0x2378e;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #406
// Name: FUN_000237a4
// Address: 000237a4
// JNI: NO
// ============================================================


void FUN_000237a4(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_000237d0 + 0x237b4,0xd);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_0001dcd6(param_2,DAT_000237d4 + 0x237ca,1);
  return;
}




// ============================================================
// Function #407
// Name: FUN_000237d8
// Address: 000237d8
// JNI: NO
// ============================================================


void FUN_000237d8(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #408
// Name: FUN_00023824
// Address: 00023824
// JNI: NO
// ============================================================


void FUN_00023824(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #409
// Name: FUN_00023832
// Address: 00023832
// JNI: NO
// ============================================================


undefined4 FUN_00023832(void)

{
  return 1;
}




// ============================================================
// Function #410
// Name: FUN_0002383a
// Address: 0002383a
// JNI: NO
// ============================================================


undefined4 FUN_0002383a(void)

{
  return 1;
}




// ============================================================
// Function #411
// Name: FUN_00023842
// Address: 00023842
// JNI: NO
// ============================================================


void FUN_00023842(int param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00023850. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 8) + 0x10))();
  return;
}




// ============================================================
// Function #412
// Name: FUN_000238d4
// Address: 000238d4
// JNI: NO
// ============================================================


undefined4 FUN_000238d4(int param_1,int param_2,undefined4 *param_3)

{
  int iVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  undefined4 uVar6;
  int *piVar7;
  bool bVar8;
  
  iVar1 = *(int *)(param_1 + 8);
  if ((*(char *)(iVar1 + 4) == '\b') &&
     (iVar1 = FUN_0001d2ce(*(undefined4 *)(iVar1 + 8),*(undefined4 *)(iVar1 + 0xc),
                           DAT_00023a48 + 0x238f6,4), iVar1 != 0)) {
    uVar6 = *(undefined4 *)(param_2 + 4);
    FUN_0001bdc8(param_2,0x22);
    piVar5 = (int *)*param_3;
    piVar7 = piVar5 + param_3[1];
    bVar8 = false;
    for (; piVar5 != piVar7; piVar5 = piVar5 + 1) {
      iVar1 = *piVar5;
      if (*(char *)(iVar1 + 4) != 'M') {
LAB_00023a2e:
        *(undefined4 *)(param_2 + 4) = uVar6;
        goto LAB_00023a32;
      }
      pbVar2 = *(byte **)(iVar1 + 0x10);
      uVar4 = 0;
      for (iVar1 = *(int *)(iVar1 + 0x14); iVar1 != 0; iVar1 = iVar1 + -1) {
        uVar3 = (uint)*pbVar2;
        if (((uVar3 < 0x30) || (0x39 < uVar3)) || (0x19 < (int)uVar4)) goto LAB_00023a2e;
        pbVar2 = pbVar2 + 1;
        uVar4 = (uVar3 + uVar4 * 10) - 0x30;
      }
      if (0xff < (int)uVar4) goto LAB_00023a2e;
      if (bVar8) {
        uVar3 = uVar4 - 0x30;
        bVar8 = 9 < uVar3;
        if (bVar8) {
          uVar3 = uVar4 - 0x61;
        }
        if ((!bVar8 || uVar3 < 6) || (uVar4 - 0x41 < 6)) {
          FUN_0001dcd6(param_2,DAT_00023a4c + 0x23976,2);
        }
      }
      switch(uVar4) {
      case 7:
        iVar1 = DAT_00023a54 + 0x23990;
        break;
      case 8:
        iVar1 = DAT_00023a58 + 0x239c6;
        break;
      case 9:
        iVar1 = DAT_00023a68 + 0x239aa;
        break;
      case 10:
        iVar1 = DAT_00023a60 + 0x239b6;
        break;
      case 0xb:
        iVar1 = DAT_00023a6c + 0x239a4;
        break;
      case 0xc:
        iVar1 = DAT_00023a5c + 0x239cc;
        break;
      case 0xd:
        iVar1 = DAT_00023a64 + 0x239d2;
        break;
      default:
        if (uVar4 == 0x22) {
          iVar1 = DAT_00023a70 + 0x239b0;
          break;
        }
        if (uVar4 == 0x5c) {
          iVar1 = DAT_00023a50 + 0x2399e;
          break;
        }
        if ((0x1f < (int)uVar4) && (uVar4 != 0x7f)) {
          FUN_0001bdc8(param_2,uVar4);
          goto LAB_000239d8;
        }
        FUN_0001bdc8(param_2,0x5c);
        iVar1 = DAT_00023a74 + 0x239f6;
        if ((7 < (int)uVar4) && (FUN_0001bdc8(param_2,0x78), 0xf < uVar4)) {
          FUN_0001bdc8(param_2,*(undefined1 *)(iVar1 + (uVar4 >> 4)));
        }
        FUN_0001bdc8(param_2,*(undefined1 *)(iVar1 + (uVar4 & 0xf)));
        bVar8 = true;
        goto LAB_000239da;
      }
      FUN_0001dcd6(param_2,iVar1,2);
LAB_000239d8:
      bVar8 = false;
LAB_000239da:
    }
    FUN_0001bdc8(param_2,0x22);
    uVar6 = 1;
  }
  else {
LAB_00023a32:
    uVar6 = 0;
  }
  return uVar6;
}




// ============================================================
// Function #413
// Name: FUN_00023a78
// Address: 00023a78
// JNI: NO
// ============================================================


void FUN_00023a78(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #414
// Name: FUN_00023a86
// Address: 00023a86
// JNI: NO
// ============================================================


void FUN_00023a86(int param_1)

{
  FUN_0001eaae(*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #415
// Name: FUN_00023a94
// Address: 00023a94
// JNI: NO
// ============================================================


void FUN_00023a94(int param_1,undefined4 param_2)

{
  int iVar1;
  
  (**(code **)(**(int **)(param_1 + 0xc) + 0x10))(*(int **)(param_1 + 0xc),param_2);
  iVar1 = FUN_0001ead4(*(undefined4 *)(param_1 + 0xc),param_2);
  if ((iVar1 == 0) && (iVar1 = FUN_0001eaf4(*(undefined4 *)(param_1 + 0xc),param_2), iVar1 == 0)) {
    iVar1 = DAT_00023aec + 0x23aca;
  }
  else {
    iVar1 = DAT_00023ae8 + 0x23ac2;
  }
  FUN_0001dcd6(param_2,iVar1,1);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_0001dcd6(param_2,DAT_00023af0 + 0x23ae0,3);
  return;
}




// ============================================================
// Function #416
// Name: FUN_00023af4
// Address: 00023af4
// JNI: NO
// ============================================================


void FUN_00023af4(int param_1,undefined4 param_2)

{
  int iVar1;
  
  iVar1 = FUN_0001ead4(*(undefined4 *)(param_1 + 0xc));
  if ((iVar1 != 0) || (iVar1 = FUN_0001eaf4(*(undefined4 *)(param_1 + 0xc),param_2), iVar1 != 0)) {
    FUN_0001dcd6(param_2,DAT_00023b28 + 0x23b18,1);
  }
                    /* WARNING: Could not recover jumptable at 0x00023b26. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 0xc) + 0x14))(*(int **)(param_1 + 0xc),param_2);
  return;
}




// ============================================================
// Function #417
// Name: FUN_00023b2c
// Address: 00023b2c
// JNI: NO
// ============================================================


void FUN_00023b2c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #418
// Name: FUN_00023b3a
// Address: 00023b3a
// JNI: NO
// ============================================================


void FUN_00023b3a(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  FUN_0001bdc8(uVar1,0x20);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  return;
}




// ============================================================
// Function #419
// Name: FUN_00023b5e
// Address: 00023b5e
// JNI: NO
// ============================================================


void FUN_00023b5e(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #420
// Name: FUN_00023b6c
// Address: 00023b6c
// JNI: NO
// ============================================================


void FUN_00023b6c(int param_1)

{
  FUN_0001eaae(*(undefined4 *)(param_1 + 8));
  return;
}




