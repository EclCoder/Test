// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 341-360
// ============================================================

// ============================================================
// Function #341
// Name: FUN_00022640
// Address: 00022640
// JNI: NO
// ============================================================


void FUN_00022640(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x0002264e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 0xc) + 0x1c))();
  return;
}




// ============================================================
// Function #342
// Name: FUN_00022650
// Address: 00022650
// JNI: NO
// ============================================================


void FUN_00022650(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #343
// Name: FUN_0002268c
// Address: 0002268c
// JNI: NO
// ============================================================


void FUN_0002268c(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x0002269a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 0xc) + 0x1c))();
  return;
}




// ============================================================
// Function #344
// Name: FUN_0002269c
// Address: 0002269c
// JNI: NO
// ============================================================


void FUN_0002269c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #345
// Name: FUN_000226d8
// Address: 000226d8
// JNI: NO
// ============================================================


void FUN_000226d8(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x000226e6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 0xc) + 0x1c))();
  return;
}




// ============================================================
// Function #346
// Name: FUN_000226e8
// Address: 000226e8
// JNI: NO
// ============================================================


void FUN_000226e8(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #347
// Name: FUN_000226f6
// Address: 000226f6
// JNI: NO
// ============================================================


byte * FUN_000226f6(byte *param_1,byte *param_2)

{
  byte bVar1;
  uint uVar2;
  byte *pbVar3;
  
  if (param_1 != param_2) {
    uVar2 = (uint)*param_1;
    pbVar3 = param_1;
    if (uVar2 == 0x5f) {
      if (param_1 + 1 != param_2) {
        uVar2 = (uint)param_1[1];
        if (0xfffffff5 < uVar2 - 0x3a) {
          return param_1 + 2;
        }
        if (uVar2 == 0x5f) {
          pbVar3 = param_1 + 2;
          while (pbVar3 != param_2) {
            bVar1 = *pbVar3;
            pbVar3 = pbVar3 + 1;
            if (bVar1 - 0x3a < 0xfffffff6) {
              if (bVar1 == 0x5f) {
                param_1 = pbVar3;
              }
              return param_1;
            }
          }
        }
      }
    }
    else {
      while (0xfffffff5 < uVar2 - 0x3a) {
        pbVar3 = pbVar3 + 1;
        if (pbVar3 == param_2) {
          return param_2;
        }
        uVar2 = (uint)*pbVar3;
      }
    }
  }
  return param_1;
}




// ============================================================
// Function #348
// Name: FUN_0002275c
// Address: 0002275c
// JNI: NO
// ============================================================


int * FUN_0002275c(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_00022798 + 0x2278a;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #349
// Name: FUN_0002279c
// Address: 0002279c
// JNI: NO
// ============================================================


void FUN_0002279c(int param_1,int *param_2,int *param_3)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 0x1a;
  iVar2 = *param_3;
  *piVar1 = DAT_000227d4 + 0x227c2;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #350
// Name: FUN_000227d8
// Address: 000227d8
// JNI: NO
// ============================================================


void FUN_000227d8(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  FUN_0001dcd6(param_2,DAT_00022800 + 0x227f0,2);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc),param_2);
  return;
}




// ============================================================
// Function #351
// Name: FUN_00022804
// Address: 00022804
// JNI: NO
// ============================================================


void FUN_00022804(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #352
// Name: FUN_00022812
// Address: 00022812
// JNI: NO
// ============================================================


void FUN_00022812(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar1 < uVar2) {
    FUN_0001eaae(*(undefined4 *)(*(int *)(param_1 + 8) + uVar1 * 4));
    return;
  }
  return;
}




// ============================================================
// Function #353
// Name: FUN_00022840
// Address: 00022840
// JNI: NO
// ============================================================


void FUN_00022840(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar1 < uVar2) {
    FUN_0001ead4(*(undefined4 *)(*(int *)(param_1 + 8) + uVar1 * 4));
    return;
  }
  return;
}




// ============================================================
// Function #354
// Name: FUN_0002286e
// Address: 0002286e
// JNI: NO
// ============================================================


void FUN_0002286e(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar1 < uVar2) {
    FUN_0001eaf4(*(undefined4 *)(*(int *)(param_1 + 8) + uVar1 * 4));
    return;
  }
  return;
}




// ============================================================
// Function #355
// Name: FUN_0002289c
// Address: 0002289c
// JNI: NO
// ============================================================


void FUN_0002289c(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar2 <= uVar1) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x000228c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(*(int *)(param_1 + 8) + uVar1 * 4) + 0xc))();
  return;
}




// ============================================================
// Function #356
// Name: FUN_000228ca
// Address: 000228ca
// JNI: NO
// ============================================================


void FUN_000228ca(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar2 <= uVar1) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x000228f6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(*(int *)(param_1 + 8) + uVar1 * 4) + 0x10))();
  return;
}




// ============================================================
// Function #357
// Name: FUN_000228f8
// Address: 000228f8
// JNI: NO
// ============================================================


void FUN_000228f8(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar2 <= uVar1) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00022924. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(*(int *)(param_1 + 8) + uVar1 * 4) + 0x14))();
  return;
}




// ============================================================
// Function #358
// Name: FUN_00022926
// Address: 00022926
// JNI: NO
// ============================================================


void FUN_00022926(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #359
// Name: FUN_00022934
// Address: 00022934
// JNI: NO
// ============================================================


void FUN_00022934(int param_1,int param_2)

{
  undefined4 uVar1;
  
  uVar1 = *(undefined4 *)(param_2 + 0x14);
  *(undefined4 *)(param_2 + 0x14) = 0;
  FUN_0001dcd6(param_2,DAT_00022978 + 0x22950,1);
  FUN_000205b8(param_1 + 8,param_2);
  FUN_0001dcd6(param_2,DAT_0002297c + 0x22966,1);
  *(undefined4 *)(param_2 + 0x14) = uVar1;
  return;
}




// ============================================================
// Function #360
// Name: FUN_00022980
// Address: 00022980
// JNI: NO
// ============================================================


void FUN_00022980(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




