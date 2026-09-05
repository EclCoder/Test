// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 321-340
// ============================================================

// ============================================================
// Function #321
// Name: FUN_00022268
// Address: 00022268
// JNI: NO
// ============================================================


void FUN_00022268(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #322
// Name: FUN_0002229c
// Address: 0002229c
// JNI: NO
// ============================================================


void FUN_0002229c(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #323
// Name: FUN_000222d0
// Address: 000222d0
// JNI: NO
// ============================================================


void FUN_000222d0(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x000222de. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 8) + 0x1c))();
  return;
}




// ============================================================
// Function #324
// Name: FUN_000222e0
// Address: 000222e0
// JNI: NO
// ============================================================


void FUN_000222e0(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #325
// Name: FUN_000222f0
// Address: 000222f0
// JNI: NO
// ============================================================


undefined8 FUN_000222f0(undefined4 *param_1,int *param_2)

{
  ushort uVar1;
  char *pcVar2;
  undefined4 uVar3;
  int *piVar4;
  uint unaff_r5;
  int unaff_r6;
  int iVar5;
  
  iVar5 = DAT_00022368 + 0x22312;
  while( true ) {
    pcVar2 = (char *)*param_1;
    if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'B')) goto LAB_0002235e;
    *param_1 = pcVar2 + 1;
    FUN_000224c2(&stack0xffffffd4,param_1);
    if (&stack0xfffffff8 == (undefined1 *)0x0) break;
    uVar3 = FUN_0001dbc0(param_1 + 0x66,0x14);
    uVar1 = *(ushort *)((int)param_2 + 5);
    unaff_r5 = (uVar1 & 0xfff) >> 10;
    piVar4 = (int *)FUN_0001e9c0(uVar3,9,(byte)uVar1 >> 6,(uVar1 & 0x3ff) >> 8);
    piVar4[2] = (int)param_2;
    piVar4[3] = unaff_r6;
    piVar4[4] = (int)&stack0xfffffff8;
    *piVar4 = iVar5;
    param_2 = piVar4;
  }
  param_2 = (int *)0x0;
LAB_0002235e:
  return CONCAT44(unaff_r5,param_2);
}




// ============================================================
// Function #326
// Name: FUN_0002236c
// Address: 0002236c
// JNI: NO
// ============================================================


int FUN_0002236c(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_00022394 + 0x2238e,DAT_00022398 + 0x22390,0x94,DAT_0002239c + 0x22392);
  }
  return *param_1 + param_2 * 4;
}




// ============================================================
// Function #327
// Name: FUN_0002237e
// Address: 0002237e
// JNI: NO
// ============================================================


void FUN_0002237e(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_00022394 + 0x2238e,DAT_00022398 + 0x22390,0x94,DAT_0002239c + 0x22392);
}




// ============================================================
// Function #328
// Name: FUN_000223a0
// Address: 000223a0
// JNI: NO
// ============================================================


void FUN_000223a0(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 local_18;
  undefined4 uStack_14;
  
  local_18 = param_3;
  uStack_14 = param_4;
  FUN_0001dcd6(param_2,DAT_000223c8 + 0x223b0,5);
  FUN_000223cc(&local_18,param_1);
  FUN_0001dcd6(param_2,local_18,uStack_14);
  return;
}




// ============================================================
// Function #329
// Name: FUN_000223cc
// Address: 000223cc
// JNI: NO
// ============================================================


void FUN_000223cc(int *param_1,int param_2)

{
  int iVar1;
  
  FUN_0002249c();
  if (1 < *(uint *)(param_2 + 8)) {
    iVar1 = FUN_0001d2b8(*param_1,param_1[1],DAT_00022410 + 0x223ea,6);
    if (iVar1 == 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_00022414 + 0x2240a,DAT_00022418 + 0x2240c,0x6be,DAT_0002241c + 0x2240e);
    }
    *param_1 = *param_1 + 6;
    param_1[1] = param_1[1] + -6;
  }
  return;
}




// ============================================================
// Function #330
// Name: FUN_00022420
// Address: 00022420
// JNI: NO
// ============================================================


void FUN_00022420(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #331
// Name: FUN_0002249c
// Address: 0002249c
// JNI: NO
// ============================================================


void FUN_0002249c(undefined4 param_1,int param_2)

{
  FUN_0001bee0(param_1,*(undefined4 *)(DAT_000224b0 + 0x224a8 + *(int *)(param_2 + 8) * 4));
  return;
}




// ============================================================
// Function #332
// Name: FUN_000224b4
// Address: 000224b4
// JNI: NO
// ============================================================


void FUN_000224b4(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #333
// Name: FUN_000224c2
// Address: 000224c2
// JNI: NO
// ============================================================


void FUN_000224c2(int *param_1,int *param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  uint local_14;
  
  local_14 = param_4;
  iVar1 = FUN_0001ddac(param_2,&local_14,param_3,param_4,param_3);
  if (iVar1 == 0) {
    iVar1 = *param_2;
    if (local_14 <= (uint)(param_2[1] - iVar1)) {
      *param_1 = iVar1;
      param_1[1] = local_14;
      *param_2 = iVar1 + local_14;
      return;
    }
  }
  *param_1 = 0;
  param_1[1] = 0;
  return;
}




// ============================================================
// Function #334
// Name: FUN_0002253c
// Address: 0002253c
// JNI: NO
// ============================================================


void FUN_0002253c(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x0002254a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 8) + 0x1c))();
  return;
}




// ============================================================
// Function #335
// Name: FUN_0002254c
// Address: 0002254c
// JNI: NO
// ============================================================


void FUN_0002254c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #336
// Name: FUN_0002255a
// Address: 0002255a
// JNI: NO
// ============================================================


void FUN_0002255a(int param_1,undefined4 param_2)

{
  FUN_000203aa(param_2,0x5b);
  FUN_000205b8(param_1 + 8,param_2);
  FUN_000203fa(param_2,0x5d);
  return;
}




// ============================================================
// Function #337
// Name: FUN_00022580
// Address: 00022580
// JNI: NO
// ============================================================


void FUN_00022580(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #338
// Name: FUN_00022590
// Address: 00022590
// JNI: NO
// ============================================================


void FUN_00022590(int param_1,int *param_2,undefined1 *param_3,int *param_4)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
  *(undefined1 *)(piVar1 + 1) = 0x31;
  *piVar1 = DAT_000225d8 + 0x225ba;
  piVar1[2] = *param_2;
  *(undefined1 *)(piVar1 + 3) = *param_3;
  piVar1[4] = *param_4;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #339
// Name: FUN_00022610
// Address: 00022610
// JNI: NO
// ============================================================


void FUN_00022610(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #340
// Name: FUN_0002261e
// Address: 0002261e
// JNI: NO
// ============================================================


void FUN_0002261e(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc));
  FUN_0001bdc8(param_2,0x40);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  return;
}




