// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 381-400
// ============================================================

// ============================================================
// Function #381
// Name: FUN_000232b4
// Address: 000232b4
// JNI: NO
// ============================================================


int * FUN_000232b4(int param_1)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  int *piVar5;
  
  iVar2 = FUN_0001bec0(param_1,DAT_0002335c + 0x232c6,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_00023364 + 0x232e0,2);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,DAT_0002336c + 0x232fa,2);
      if (iVar2 == 0) {
        iVar3 = 0;
        bVar1 = true;
        iVar2 = 0;
        goto LAB_0002330a;
      }
      iVar2 = 4;
      iVar3 = DAT_00023370 + 0x2330a;
    }
    else {
      iVar2 = 5;
      iVar3 = DAT_00023368 + 0x232f0;
    }
  }
  else {
    iVar2 = 6;
    iVar3 = DAT_00023360 + 0x232d6;
  }
  bVar1 = false;
LAB_0002330a:
  piVar4 = (int *)FUN_0001d34c(param_1,0);
  if ((!bVar1) && (piVar4 != (int *)0x0)) {
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
    piVar5[2] = iVar3;
    piVar5[3] = iVar2;
    *(undefined1 *)(piVar5 + 1) = 6;
    piVar5[4] = (int)piVar4;
    *piVar5 = DAT_00023374 + 0x2333a;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    piVar4 = piVar5;
  }
  return piVar4;
}




// ============================================================
// Function #382
// Name: FUN_00023378
// Address: 00023378
// JNI: NO
// ============================================================


void FUN_00023378(int param_1,int *param_2,undefined4 *param_3,undefined4 param_4)

{
  undefined4 uVar1;
  undefined4 *puVar2;
  undefined4 uVar3;
  int iVar4;
  
  uVar1 = FUN_0001dbc0(param_1 + 0x198,0x14,param_3,param_4,param_3,param_4);
  iVar4 = *param_2;
  uVar3 = *param_3;
  puVar2 = (undefined4 *)FUN_0001e9c0(uVar1,0xd,*(byte *)(iVar4 + 5) >> 6,1,1);
  puVar2[2] = iVar4;
  puVar2[3] = uVar3;
  *(undefined1 *)(puVar2 + 4) = 0;
  *puVar2 = FUN_000233b4 + DAT_000233b0;
  return;
}




// ============================================================
// Function #383
// Name: FUN_000233b4
// Address: 000233b4
// JNI: NO
// ============================================================


void FUN_000233b4(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dcd6(param_2,DAT_000233e8 + 0x233c4,8);
  FUN_000203aa(uVar1,0x28);
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,0x13,0);
  FUN_000203fa(param_2,0x29);
  return;
}




// ============================================================
// Function #384
// Name: FUN_000233ec
// Address: 000233ec
// JNI: NO
// ============================================================


void FUN_000233ec(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #385
// Name: FUN_00023430
// Address: 00023430
// JNI: NO
// ============================================================


void FUN_00023430(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #386
// Name: FUN_0002343e
// Address: 0002343e
// JNI: NO
// ============================================================


undefined4 FUN_0002343e(void)

{
  return 1;
}




// ============================================================
// Function #387
// Name: FUN_00023446
// Address: 00023446
// JNI: NO
// ============================================================


undefined4 FUN_00023446(void)

{
  return 1;
}




// ============================================================
// Function #388
// Name: FUN_00023474
// Address: 00023474
// JNI: NO
// ============================================================


void FUN_00023474(int param_1,undefined4 param_2)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_000203fa(param_2,0x29);
  (**(code **)(**(int **)(param_1 + 8) + 0x14))(*(int **)(param_1 + 8),param_2);
  uVar1 = *(uint *)(param_1 + 0x14);
  if ((uVar1 & 1) != 0) {
    FUN_0001dcd6(param_2,DAT_00023510 + 0x234b0,6);
    uVar1 = *(uint *)(param_1 + 0x14);
  }
  if ((int)(uVar1 << 0x1e) < 0) {
    FUN_0001dcd6(param_2,DAT_00023514 + 0x234c2,9);
    uVar1 = *(uint *)(param_1 + 0x14);
  }
  if ((int)(uVar1 << 0x1d) < 0) {
    FUN_0001dcd6(param_2,DAT_00023518 + 0x234d4,9);
  }
  if (*(char *)(param_1 + 0x18) == '\x01') {
    uVar3 = 2;
    iVar2 = DAT_0002351c + 0x234f0;
  }
  else {
    if (*(char *)(param_1 + 0x18) != '\x02') goto LAB_000234f4;
    uVar3 = 3;
    iVar2 = DAT_00023520 + 0x234e8;
  }
  FUN_0001dcd6(param_2,iVar2,uVar3);
LAB_000234f4:
  if (*(int *)(param_1 + 0x1c) != 0) {
    FUN_0001bdc8(param_2,0x20);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x1c),param_2);
    return;
  }
  return;
}




// ============================================================
// Function #389
// Name: FUN_00023524
// Address: 00023524
// JNI: NO
// ============================================================


void FUN_00023524(undefined4 param_1)

{
  FUN_00023f68(param_1,0x20);
  return;
}




// ============================================================
// Function #390
// Name: FUN_00023578
// Address: 00023578
// JNI: NO
// ============================================================


void FUN_00023578(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #391
// Name: FUN_000235c0
// Address: 000235c0
// JNI: NO
// ============================================================


void FUN_000235c0(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #392
// Name: FUN_000235ce
// Address: 000235ce
// JNI: NO
// ============================================================


void FUN_000235ce(int param_1)

{
  FUN_0001eaae(*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #393
// Name: FUN_000235dc
// Address: 000235dc
// JNI: NO
// ============================================================


void FUN_000235dc(int param_1)

{
  FUN_0001ead4(*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #394
// Name: FUN_000235ea
// Address: 000235ea
// JNI: NO
// ============================================================


void FUN_000235ea(int param_1)

{
  FUN_0001eaf4(*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #395
// Name: FUN_000235f8
// Address: 000235f8
// JNI: NO
// ============================================================


void FUN_000235f8(int param_1,undefined4 param_2)

{
  uint uVar1;
  
  (**(code **)(**(int **)(param_1 + 0xc) + 0x10))(*(int **)(param_1 + 0xc),param_2);
  uVar1 = *(uint *)(param_1 + 8);
  if ((uVar1 & 1) != 0) {
    FUN_0001dcd6(param_2,DAT_00023648 + 0x2361a,6);
    uVar1 = *(uint *)(param_1 + 8);
  }
  if ((int)(uVar1 << 0x1e) < 0) {
    FUN_0001dcd6(param_2,DAT_0002364c + 0x2362c,9);
    uVar1 = *(uint *)(param_1 + 8);
  }
  if (-1 < (int)(uVar1 << 0x1d)) {
    return;
  }
  FUN_0001dcd6(param_2,DAT_00023650 + 0x23640,9);
  return;
}




// ============================================================
// Function #396
// Name: FUN_00023654
// Address: 00023654
// JNI: NO
// ============================================================


void FUN_00023654(int param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00023662. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 0xc) + 0x14))();
  return;
}




// ============================================================
// Function #397
// Name: FUN_00023664
// Address: 00023664
// JNI: NO
// ============================================================


void FUN_00023664(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #398
// Name: FUN_00023672
// Address: 00023672
// JNI: NO
// ============================================================


void FUN_00023672(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  FUN_0001bdc8(uVar1,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  FUN_0001bdc8(param_2,0x29);
  return;
}




// ============================================================
// Function #399
// Name: FUN_0002369e
// Address: 0002369e
// JNI: NO
// ============================================================


void FUN_0002369e(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #400
// Name: FUN_000236ac
// Address: 000236ac
// JNI: NO
// ============================================================


void FUN_000236ac(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_000236cc + 0x236bc,6);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  return;
}




