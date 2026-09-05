// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 361-380
// ============================================================

// ============================================================
// Function #361
// Name: FUN_0002298e
// Address: 0002298e
// JNI: NO
// ============================================================


void FUN_0002298e(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc),param_2);
  return;
}




// ============================================================
// Function #362
// Name: FUN_000229a8
// Address: 000229a8
// JNI: NO
// ============================================================


void FUN_000229a8(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x000229b6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 8) + 0x1c))();
  return;
}




// ============================================================
// Function #363
// Name: FUN_000229b8
// Address: 000229b8
// JNI: NO
// ============================================================


void FUN_000229b8(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #364
// Name: FUN_000229c8
// Address: 000229c8
// JNI: NO
// ============================================================


int FUN_000229c8(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_000229f0 + 0x229ea,DAT_000229f4 + 0x229ec,0x94,DAT_000229f8 + 0x229ee);
  }
  return *param_1 + param_2 * 4;
}




// ============================================================
// Function #365
// Name: FUN_000229da
// Address: 000229da
// JNI: NO
// ============================================================


void FUN_000229da(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_000229f0 + 0x229ea,DAT_000229f4 + 0x229ec,0x94,DAT_000229f8 + 0x229ee);
}




// ============================================================
// Function #366
// Name: FUN_000229fc
// Address: 000229fc
// JNI: NO
// ============================================================


void FUN_000229fc(int param_1)

{
  FUN_000205b8(param_1 + 8);
  return;
}




// ============================================================
// Function #367
// Name: FUN_00022a0a
// Address: 00022a0a
// JNI: NO
// ============================================================


void FUN_00022a0a(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #368
// Name: FUN_00022a18
// Address: 00022a18
// JNI: NO
// ============================================================


void FUN_00022a18(int param_1)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #369
// Name: FUN_00022a26
// Address: 00022a26
// JNI: NO
// ============================================================


void FUN_00022a26(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #370
// Name: FUN_00022a34
// Address: 00022a34
// JNI: NO
// ============================================================


void FUN_00022a34(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_00022a60 + 0x22a44,0xc);
  FUN_000205b8(param_1 + 8,param_2);
  FUN_0001bdc8(param_2,0x5d);
  return;
}




// ============================================================
// Function #371
// Name: FUN_00022a64
// Address: 00022a64
// JNI: NO
// ============================================================


void FUN_00022a64(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #372
// Name: FUN_00022a98
// Address: 00022a98
// JNI: NO
// ============================================================


void FUN_00022a98(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #373
// Name: FUN_00022aa6
// Address: 00022aa6
// JNI: NO
// ============================================================


undefined4 FUN_00022aa6(void)

{
  return 1;
}




// ============================================================
// Function #374
// Name: FUN_00022aae
// Address: 00022aae
// JNI: NO
// ============================================================


undefined4 FUN_00022aae(void)

{
  return 1;
}




// ============================================================
// Function #375
// Name: FUN_00022af4
// Address: 00022af4
// JNI: NO
// ============================================================


void FUN_00022af4(int param_1,undefined4 param_2)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  undefined4 uVar4;
  
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0x10,param_2);
  FUN_000203fa(param_2,0x29);
  piVar1 = *(int **)(param_1 + 8);
  if (piVar1 != (int *)0x0) {
    (**(code **)(*piVar1 + 0x14))(piVar1,param_2);
  }
  uVar2 = *(uint *)(param_1 + 0x20);
  if ((uVar2 & 1) != 0) {
    FUN_0001dcd6(param_2,DAT_00022ba0 + 0x22b32,6);
    uVar2 = *(uint *)(param_1 + 0x20);
  }
  if ((int)(uVar2 << 0x1e) < 0) {
    FUN_0001dcd6(param_2,DAT_00022ba4 + 0x22b44,9);
    uVar2 = *(uint *)(param_1 + 0x20);
  }
  if ((int)(uVar2 << 0x1d) < 0) {
    FUN_0001dcd6(param_2,DAT_00022ba8 + 0x22b56,9);
  }
  if (*(char *)(param_1 + 0x24) == '\x01') {
    uVar4 = 2;
    iVar3 = DAT_00022bac + 0x22b74;
  }
  else {
    if (*(char *)(param_1 + 0x24) != '\x02') goto LAB_00022b78;
    uVar4 = 3;
    iVar3 = DAT_00022bb0 + 0x22b6c;
  }
  FUN_0001dcd6(param_2,iVar3,uVar4);
LAB_00022b78:
  if (*(int *)(param_1 + 0x18) != 0) {
    FUN_0001bd9c(*(int *)(param_1 + 0x18),param_2);
  }
  if (*(int *)(param_1 + 0x1c) != 0) {
    FUN_0001dcd6(param_2,DAT_00022bb4 + 0x22b90,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x1c),param_2);
    return;
  }
  return;
}




// ============================================================
// Function #376
// Name: FUN_00022bb8
// Address: 00022bb8
// JNI: NO
// ============================================================


void FUN_00022bb8(undefined4 param_1)

{
  FUN_00023f68(param_1,0x28);
  return;
}




// ============================================================
// Function #377
// Name: FUN_00022c0c
// Address: 00022c0c
// JNI: NO
// ============================================================


void FUN_00022c0c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #378
// Name: FUN_00022c1c
// Address: 00022c1c
// JNI: NO
// ============================================================


int * FUN_00022c1c(undefined4 *param_1)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  char *pcVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  undefined4 uVar8;
  int *piVar9;
  int iVar10;
  char *pcVar11;
  int unaff_r6;
  int iVar12;
  undefined1 uVar13;
  
  iVar1 = FUN_0001e1a4();
  iVar2 = FUN_0001bec0(param_1,DAT_00022e30 + 0x22c36,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_00022e44 + 0x22d08,2);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,DAT_00022e4c + 0x22d54,2);
      if (iVar2 == 0) {
        piVar3 = (int *)0x0;
        goto LAB_00022c48;
      }
      iVar2 = param_1[2];
      iVar5 = param_1[3];
      while ((pcVar4 = (char *)*param_1, pcVar4 == (char *)param_1[1] || (*pcVar4 != 'E'))) {
        unaff_r6 = FUN_0001c660(param_1);
        if (unaff_r6 == 0) {
          return (int *)0x0;
        }
        FUN_0001d7c0(param_1 + 2,&stack0xffffffd4);
      }
      *param_1 = pcVar4 + 1;
      FUN_0001d830(&stack0xffffffd4,param_1,iVar5 - iVar2 >> 2);
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      *(undefined1 *)(piVar3 + 1) = 0x12;
      *piVar3 = DAT_00022e50 + 0x22dc8;
      piVar3[2] = unaff_r6;
      piVar3[3] = (int)&stack0xfffffff8;
    }
    else {
      iVar2 = FUN_0001eb18(param_1);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      pcVar4 = (char *)*param_1;
      if (pcVar4 == (char *)param_1[1]) {
        return (int *)0x0;
      }
      if (*pcVar4 != 'E') {
        return (int *)0x0;
      }
      *param_1 = pcVar4 + 1;
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar3 + 1) = 0x11;
      piVar3[2] = iVar2;
      *piVar3 = DAT_00022e48 + 0x22d4c;
    }
    *(ushort *)((int)piVar3 + 5) = (*(ushort *)((int)piVar3 + 5) & 0xf000) + 0x540;
  }
  else {
    piVar3 = (int *)FUN_000230b4(param_1,DAT_00022e34 + 0x22c44);
  }
LAB_00022c48:
  FUN_0001bec0(param_1,DAT_00022e38 + 0x22c52,2);
  pcVar4 = (char *)*param_1;
  if ((pcVar4 != (char *)param_1[1]) && (*pcVar4 == 'F')) {
    pcVar11 = pcVar4 + 1;
    *param_1 = pcVar11;
    if ((pcVar11 != (char *)param_1[1]) && (*pcVar11 == 'Y')) {
      *param_1 = pcVar4 + 2;
    }
    iVar2 = FUN_0001c660(param_1);
    if (iVar2 != 0) {
      iVar5 = param_1[2];
      uVar13 = 2;
      iVar10 = param_1[3];
      iVar12 = DAT_00022e3c + 0x22ca8;
      iVar6 = DAT_00022e40 + 0x22caa;
LAB_00022caa:
      while (pcVar4 = (char *)*param_1, pcVar4 != (char *)param_1[1]) {
        if (*pcVar4 == 'E') {
          uVar13 = 0;
          *param_1 = pcVar4 + 1;
          goto LAB_00022dea;
        }
        if (*pcVar4 != 'v') break;
        *param_1 = pcVar4 + 1;
      }
      iVar7 = FUN_0001bec0(param_1,iVar12,2);
      if (iVar7 == 0) {
        iVar7 = FUN_0001bec0(param_1,iVar6,2);
        if (iVar7 == 0) {
          unaff_r6 = FUN_0001c660(param_1);
          if (unaff_r6 == 0) {
            return (int *)0x0;
          }
          FUN_0001d7c0(param_1 + 2,&stack0xffffffd4);
          goto LAB_00022caa;
        }
      }
      else {
        uVar13 = 1;
      }
LAB_00022dea:
      FUN_0001d830(&stack0xffffffd4,param_1,iVar10 - iVar5 >> 2);
      uVar8 = FUN_0001dbc0(param_1 + 0x66,0x20);
      piVar9 = (int *)FUN_0001e9c0(uVar8,0x10,0,1,0);
      piVar9[7] = (int)piVar3;
      piVar9[2] = iVar2;
      piVar9[3] = unaff_r6;
      piVar9[4] = (int)&stack0xfffffff8;
      *(undefined1 *)(piVar9 + 6) = uVar13;
      piVar9[5] = iVar1;
      *piVar9 = DAT_00022e54 + 0x22e32;
      return piVar9;
    }
  }
  return (int *)0x0;
}




// ============================================================
// Function #379
// Name: FUN_00022e58
// Address: 00022e58
// JNI: NO
// ============================================================


int * FUN_00022e58(int *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  ushort uVar1;
  char *pcVar2;
  int iVar3;
  int *piVar4;
  int *piVar5;
  int unaff_r4;
  int unaff_r5;
  int unaff_r6;
  int iVar6;
  
  pcVar2 = (char *)*param_1;
  if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'U')) {
    iVar3 = FUN_0001e1a4(param_1);
    piVar4 = (int *)FUN_0001c660(param_1);
    if (piVar4 != (int *)0x0) {
      if (iVar3 == 0) {
        return piVar4;
      }
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      uVar1 = *(ushort *)((int)piVar4 + 5);
      FUN_0001e9c0(piVar5,3,(byte)uVar1 >> 6,(uVar1 & 0x3ff) >> 8,(uVar1 & 0xfff) >> 10);
      piVar5[2] = iVar3;
      piVar5[3] = (int)piVar4;
      *piVar5 = DAT_00022fb0 + 0x22f38;
      return piVar5;
    }
  }
  else {
    *param_1 = (int)(pcVar2 + 1);
    FUN_000224c2(&stack0xffffffd8,param_1,param_3,param_4,param_3,param_4);
    if (&stack0xfffffff8 != (undefined1 *)0x0) {
      iVar3 = FUN_0001d2b8(unaff_r6,&stack0xfffffff8,DAT_00022fa4 + 0x22e92,9);
      if (iVar3 == 0) {
        if (((char *)param_1[1] == (char *)*param_1) || (*(char *)*param_1 != 'I')) {
          iVar3 = 0;
        }
        else {
          iVar3 = FUN_0001df74(param_1,0);
          if (iVar3 == 0) {
            return (int *)0x0;
          }
        }
        iVar6 = FUN_00022e58(param_1);
        if (iVar6 != 0) {
          piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x18);
          *(undefined1 *)(piVar4 + 1) = 2;
          piVar4[2] = iVar6;
          piVar4[3] = unaff_r6;
          piVar4[4] = (int)&stack0xfffffff8;
          piVar4[5] = iVar3;
          iVar3 = DAT_00022fac + 0x22f82;
          goto LAB_00022f80;
        }
      }
      else {
        iVar3 = *param_1;
        iVar6 = param_1[1];
        *param_1 = unaff_r6 + 9;
        param_1[1] = (int)(&stack0xfffffff8 + unaff_r6);
        FUN_000224c2(&stack0xffffffd0,param_1);
        *param_1 = iVar3;
        param_1[1] = iVar6;
        if ((unaff_r5 != 0) && (iVar3 = FUN_00022e58(param_1), iVar3 != 0)) {
          piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
          *(undefined1 *)(piVar4 + 1) = 0xb;
          piVar4[2] = iVar3;
          piVar4[3] = unaff_r4;
          piVar4[4] = unaff_r5;
          iVar3 = DAT_00022fa8 + 0x22ee6;
LAB_00022f80:
          *piVar4 = iVar3 + 8;
          *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
          return piVar4;
        }
      }
    }
  }
  return (int *)0x0;
}




// ============================================================
// Function #380
// Name: FUN_000230b4
// Address: 000230b4
// JNI: NO
// ============================================================


int * FUN_000230b4(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_000230f0 + 0x230e2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




