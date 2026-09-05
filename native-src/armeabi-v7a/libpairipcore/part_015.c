// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 281-300
// ============================================================

// ============================================================
// Function #281
// Name: FUN_000217c4
// Address: 000217c4
// JNI: NO
// ============================================================


void FUN_000217c4(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #282
// Name: FUN_000217d4
// Address: 000217d4
// JNI: NO
// ============================================================


void FUN_000217d4(int param_1,int *param_2)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 0x43;
  *piVar1 = DAT_0002180c + 0x217f6;
  iVar2 = param_2[1];
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #283
// Name: FUN_00021810
// Address: 00021810
// JNI: NO
// ============================================================


void FUN_00021810(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dcd6(param_2,DAT_00021830 + 0x21820,2);
  FUN_0001dcd6(uVar1,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #284
// Name: FUN_00021834
// Address: 00021834
// JNI: NO
// ============================================================


void FUN_00021834(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #285
// Name: FUN_00021842
// Address: 00021842
// JNI: NO
// ============================================================


void FUN_00021842(undefined4 param_1,int param_2)

{
  FUN_0001bee0(param_1,*(undefined4 *)(param_2 + 4));
  return;
}




// ============================================================
// Function #286
// Name: FUN_0002190c
// Address: 0002190c
// JNI: NO
// ============================================================


void FUN_0002190c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x1c);
  return;
}




// ============================================================
// Function #287
// Name: FUN_0002191c
// Address: 0002191c
// JNI: NO
// ============================================================


undefined8 FUN_0002191c(undefined4 *param_1,int param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  int local_1c;
  undefined4 local_18;
  undefined4 local_14;
  
  iVar1 = param_1[1];
  local_1c = param_2;
  local_18 = param_3;
  local_14 = param_4;
  FUN_000203aa(*param_1,0x28);
  local_18 = CONCAT13(local_18._3_1_,0x54000);
  local_18 = CONCAT31(local_18._1_3_,0x2a);
  local_1c = DAT_00021958 + 0x2194a;
  local_14 = *(undefined4 *)(iVar1 + 8);
  FUN_0001bd9c(&local_1c,*param_1);
  FUN_000203fa(*param_1,0x29);
  return CONCAT44(local_1c,param_1);
}




// ============================================================
// Function #288
// Name: FUN_0002195c
// Address: 0002195c
// JNI: NO
// ============================================================


void FUN_0002195c(int param_1,int param_2)

{
  int iVar1;
  uint uVar2;
  undefined4 uVar3;
  uint uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  
  uVar5 = *(undefined4 *)(param_2 + 0xc);
  uVar6 = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)(param_2 + 0xc) = 0xffffffff;
  *(undefined4 *)(param_2 + 0x10) = 0xffffffff;
  uVar3 = *(undefined4 *)(param_2 + 4);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  uVar2 = *(uint *)(param_2 + 0x10);
  if (uVar2 == 0xffffffff) {
    FUN_0001dcd6(param_2,DAT_000219d4 + 0x21994,3);
  }
  else if (uVar2 == 0) {
    *(undefined4 *)(param_2 + 4) = uVar3;
  }
  else {
    iVar1 = DAT_000219d0 + 0x219a8;
    for (uVar4 = 1; uVar4 < uVar2; uVar4 = uVar4 + 1) {
      FUN_0001dcd6(param_2,iVar1,2);
      uVar3 = *(undefined4 *)(param_1 + 8);
      *(uint *)(param_2 + 0xc) = uVar4;
      FUN_0001bd9c(uVar3,param_2);
    }
  }
  *(undefined4 *)(param_2 + 0xc) = uVar5;
  *(undefined4 *)(param_2 + 0x10) = uVar6;
  return;
}




// ============================================================
// Function #289
// Name: FUN_000219d8
// Address: 000219d8
// JNI: NO
// ============================================================


void FUN_000219d8(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #290
// Name: FUN_000219e8
// Address: 000219e8
// JNI: NO
// ============================================================


void FUN_000219e8(int param_1,int *param_2,int *param_3,undefined1 *param_4)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
  *(undefined1 *)(piVar1 + 1) = 0x51;
  iVar2 = *param_3;
  *piVar1 = DAT_00021a30 + 0x21a14;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(undefined1 *)(piVar1 + 4) = *param_4;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #291
// Name: FUN_00021a34
// Address: 00021a34
// JNI: NO
// ============================================================


void FUN_00021a34(int param_1,undefined4 param_2)

{
  int iVar1;
  
  if (*(char *)(param_1 + 0x10) == '\x01') {
    FUN_0001bdc8(param_2,0x5b);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
    FUN_0001bdc8(param_2,0x5d);
  }
  else {
    FUN_0001bdc8(param_2,0x2e);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  }
  iVar1 = *(int *)(param_1 + 0xc);
  if (1 < *(byte *)(iVar1 + 4) - 0x51) {
    FUN_0001dcd6(param_2,DAT_00021a90 + 0x21a80,3);
    iVar1 = *(int *)(param_1 + 0xc);
  }
  FUN_0001bd9c(iVar1,param_2);
  return;
}




// ============================================================
// Function #292
// Name: FUN_00021a94
// Address: 00021a94
// JNI: NO
// ============================================================


void FUN_00021a94(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #293
// Name: FUN_00021b04
// Address: 00021b04
// JNI: NO
// ============================================================


void FUN_00021b04(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #294
// Name: FUN_00021b12
// Address: 00021b12
// JNI: NO
// ============================================================


void FUN_00021b12(int param_1,undefined4 param_2)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = *(int **)(param_1 + 8);
  if (piVar1 != (int *)0x0) {
    iVar2 = (**(code **)(*piVar1 + 0x18))(piVar1,param_2,param_1 + 0xc);
    if (iVar2 != 0) {
      return;
    }
    FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  }
  FUN_0001bdc8(param_2,0x7b);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_0001bdc8(param_2,0x7d);
  return;
}




// ============================================================
// Function #295
// Name: FUN_00021b54
// Address: 00021b54
// JNI: NO
// ============================================================


void FUN_00021b54(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #296
// Name: FUN_00021b62
// Address: 00021b62
// JNI: NO
// ============================================================


void FUN_00021b62(int param_1,undefined4 param_2)

{
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_000203fa(param_2,0x29);
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc),param_2);
  FUN_000203fa(param_2,0x29);
  return;
}




// ============================================================
// Function #297
// Name: FUN_00021b9e
// Address: 00021b9e
// JNI: NO
// ============================================================


void FUN_00021b9e(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #298
// Name: FUN_00021bac
// Address: 00021bac
// JNI: NO
// ============================================================


void FUN_00021bac(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_00021c24 + 0x21bbc,1);
  if ((*(char *)(param_1 + 0xc) != '\0') || (*(int *)(param_1 + 0x10) != 0)) {
    FUN_000203aa(param_2,0x7b);
  }
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  if (((*(char *)(param_1 + 0xc) != '\0') || (*(int *)(param_1 + 0x10) != 0)) &&
     (FUN_000203fa(param_2,0x7d), (*(byte *)(param_1 + 0xc) & 1) != 0)) {
    FUN_0001dcd6(param_2,DAT_00021c28 + 0x21bf8,9);
  }
  if (*(int *)(param_1 + 0x10) != 0) {
    FUN_0001dcd6(param_2,DAT_00021c2c + 0x21c08,4);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  }
  FUN_0001bdc8(param_2,0x3b);
  return;
}




// ============================================================
// Function #299
// Name: FUN_00021c30
// Address: 00021c30
// JNI: NO
// ============================================================


void FUN_00021c30(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #300
// Name: FUN_00021c6c
// Address: 00021c6c
// JNI: NO
// ============================================================


void FUN_00021c6c(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




