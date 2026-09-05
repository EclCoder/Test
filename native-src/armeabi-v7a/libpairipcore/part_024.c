// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 461-480
// ============================================================

// ============================================================
// Function #461
// Name: FUN_00024c40
// Address: 00024c40
// JNI: NO
// ============================================================


undefined4 FUN_00024c40(int *param_1,undefined4 param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = (**(code **)(*param_1 + 0x14))(param_1);
  if (iVar1 != 0) {
    uVar2 = (**(code **)(*param_1 + 0x18))(param_1,param_2);
    *param_3 = uVar2;
    return 0;
  }
  return DAT_00024c68;
}




// ============================================================
// Function #462
// Name: FUN_00024c6c
// Address: 00024c6c
// JNI: NO
// ============================================================


undefined4 FUN_00024c6c(int *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  
  iVar1 = (**(code **)(*param_1 + 0x14))(param_1);
  if (iVar1 != 0) {
    (**(code **)(*param_1 + 0x1c))(param_1,param_2,param_3,param_4);
    return 0;
  }
  return DAT_00024c9c;
}




// ============================================================
// Function #463
// Name: FUN_00024ca0
// Address: 00024ca0
// JNI: NO
// ============================================================


void FUN_00024ca0(int *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00024ca6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x20))(param_1,0);
  return;
}




// ============================================================
// Function #464
// Name: FUN_00024ca8
// Address: 00024ca8
// JNI: NO
// ============================================================


undefined4 FUN_00024ca8(int *param_1,int param_2)

{
  undefined4 uVar1;
  
  (**(code **)(*param_1 + 0x24))(param_1,param_2);
  uVar1 = 0;
  if (*(int *)(param_2 + 4) == 0) {
    uVar1 = 0xffffe66b;
  }
  return uVar1;
}




// ============================================================
// Function #465
// Name: FUN_00024cc8
// Address: 00024cc8
// JNI: NO
// ============================================================


undefined4 FUN_00024cc8(int *param_1)

{
  (**(code **)(*param_1 + 0x28))();
  return DAT_00024cd4;
}




// ============================================================
// Function #466
// Name: FUN_00024cd8
// Address: 00024cd8
// JNI: NO
// ============================================================


void FUN_00024cd8(int *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00024cdc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x3c))();
  return;
}




// ============================================================
// Function #467
// Name: FUN_00024d16
// Address: 00024d16
// JNI: NO
// ============================================================


int FUN_00024d16(int *param_1)

{
  int iVar1;
  
  if (((char)param_1[0x60] != '\0') ||
     ((iVar1 = FUN_00024ff4(param_1), iVar1 == 1 &&
      ((**(code **)(*param_1 + 0x34))(param_1,1), (char)param_1[0x60] != '\0')))) {
    iVar1 = 0;
  }
  return iVar1;
}




// ============================================================
// Function #468
// Name: FUN_00024d7c
// Address: 00024d7c
// JNI: NO
// ============================================================


undefined4 FUN_00024d7c(int *param_1)

{
  (**(code **)(*param_1 + 0xc))(param_1,0xffffffff);
  return 0;
}




// ============================================================
// Function #469
// Name: FUN_00024d8c
// Address: 00024d8c
// JNI: NO
// ============================================================


undefined8 FUN_00024d8c(int *param_1,int param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  int local_1c;
  undefined4 uStack_18;
  uint local_14;
  
  local_1c = param_2;
  uStack_18 = param_3;
  local_14 = param_4;
  local_14 = (**(code **)(*param_1 + 0xc))(param_1,0xffffffff);
  local_14 = local_14 & 0xfffffffe;
  if (local_14 != 0) {
    if (param_2 != 0) {
      local_14 = local_14 - 1;
    }
    if (*(char *)((int)param_1 + 0x181) == '\x01') {
      local_14 = local_14 + 1;
    }
    iVar1 = FUN_0002506a(param_1[1],&local_14,&local_1c);
    if (((iVar1 != 0) && (local_1c != 0)) &&
       (iVar1 = FUN_00025090(param_1,local_14,&local_1c), iVar1 != 0)) goto LAB_00024dda;
  }
  *(undefined1 *)(param_1 + 0x60) = 1;
LAB_00024dda:
  return CONCAT44(local_1c,param_1);
}




// ============================================================
// Function #470
// Name: FUN_00024eb4
// Address: 00024eb4
// JNI: NO
// ============================================================


undefined8 FUN_00024eb4(int param_1,uint param_2)

{
  undefined4 *puVar1;
  int iVar2;
  
  iVar2 = DAT_00024f3c;
  if ((param_2 & 0xfffffff0) == 0x110) {
    iVar2 = DAT_00024f3c + 8;
    if (*(char *)(param_1 + 0x46) == '\0') {
      *(undefined1 *)(param_1 + 0x46) = 1;
      FUN_000256ac(param_1 + 0xd0);
    }
  }
  else {
    if ((param_2 & 0xfffffff0) != 0x100) {
      puVar1 = *(undefined4 **)(DAT_00024f40 + 0x24f1e);
      fprintf((FILE *)*puVar1,(char *)(DAT_00024f44 + 0x24f2a),DAT_00024f48 + 0x24f2c,
              DAT_00024f4c + 0x24f2e);
      fflush((FILE *)*puVar1);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (*(char *)(param_1 + 0x45) == '\0') {
      *(undefined1 *)(param_1 + 0x45) = 1;
      if (*(char *)(param_1 + 0x44) == '\x01') {
        FUN_000256a4();
      }
      else {
        FUN_0002569c(param_1 + 0x48);
      }
    }
  }
  return CONCAT44(*(undefined4 *)(param_1 + iVar2 + param_2 * 8 + 4),
                  *(undefined4 *)(param_1 + iVar2 + param_2 * 8));
}




// ============================================================
// Function #471
// Name: FUN_00024f50
// Address: 00024f50
// JNI: NO
// ============================================================


void FUN_00024f50(int param_1,uint param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  undefined4 *puVar2;
  
  iVar1 = DAT_00024fe0;
  if ((param_2 & 0xfffffff0) == 0x110) {
    iVar1 = DAT_00024fe0 + 8;
    if (*(char *)(param_1 + 0x46) == '\0') {
      *(undefined1 *)(param_1 + 0x46) = 1;
      FUN_000256ac(param_1 + 0xd0);
    }
  }
  else {
    if ((param_2 & 0xfffffff0) != 0x100) {
      puVar2 = *(undefined4 **)(DAT_00024fe4 + 0x24fc4);
      fprintf((FILE *)*puVar2,(char *)(DAT_00024fe8 + 0x24fd0),DAT_00024fec + 0x24fd2,
              DAT_00024ff0 + 0x24fd4);
      fflush((FILE *)*puVar2);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (*(char *)(param_1 + 0x45) == '\0') {
      *(undefined1 *)(param_1 + 0x45) = 1;
      if (*(char *)(param_1 + 0x44) == '\x01') {
        FUN_000256a4();
      }
      else {
        FUN_0002569c(param_1 + 0x48);
      }
    }
  }
  *(undefined4 *)(param_1 + iVar1 + param_2 * 8) = param_3;
  *(undefined4 *)(param_1 + iVar1 + param_2 * 8 + 4) = param_4;
  return;
}




// ============================================================
// Function #472
// Name: FUN_00024ff4
// Address: 00024ff4
// JNI: NO
// ============================================================


bool FUN_00024ff4(int param_1)

{
  undefined4 uVar1;
  int iVar2;
  undefined4 local_10;
  undefined4 uStack_c;
  
  local_10 = 0;
  uStack_c = 0;
  uVar1 = FUN_00024292(*(undefined4 *)(param_1 + 0x178),&local_10,&uStack_c);
  iVar2 = FUN_000242d8(param_1,uVar1,local_10,uStack_c);
  return iVar2 == 8;
}




// ============================================================
// Function #473
// Name: FUN_00025020
// Address: 00025020
// JNI: NO
// ============================================================


void FUN_00025020(undefined4 param_1)

{
  FUN_00025032();
  (*(code *)0x256b4)(param_1);
  return;
}




// ============================================================
// Function #474
// Name: FUN_00025032
// Address: 00025032
// JNI: NO
// ============================================================


void FUN_00025032(int param_1)

{
  if (*(char *)(param_1 + 0x45) == '\x01') {
    if (*(char *)(param_1 + 0x44) == '\x01') {
      FUN_000256d0();
    }
    else {
      FUN_000256c8(param_1 + 0x48);
    }
  }
  if (*(char *)(param_1 + 0x46) != '\x01') {
    return;
  }
  (*(code *)&LAB_000256d8)(param_1 + 0xd0);
  return;
}




// ============================================================
// Function #475
// Name: FUN_0002506a
// Address: 0002506a
// JNI: NO
// ============================================================


undefined4 FUN_0002506a(undefined4 param_1,undefined4 *param_2,int *param_3,undefined4 param_4)

{
  int iVar1;
  int local_c;
  
  local_c = 0;
  iVar1 = dl_unwind_find_exidx(*param_2,&local_c,param_3,param_4,param_3);
  *param_3 = iVar1;
  param_3[1] = local_c << 3;
  if ((iVar1 != 0) && (local_c << 3 != 0)) {
    return 1;
  }
  return 0;
}




// ============================================================
// Function #476
// Name: FUN_00025090
// Address: 00025090
// JNI: NO
// ============================================================


undefined4 FUN_00025090(int param_1,uint param_2,int *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  uint *puVar4;
  uint *puVar5;
  int iVar6;
  int *piVar7;
  uint uVar8;
  uint uVar9;
  undefined4 *puVar10;
  uint uVar11;
  uint uVar12;
  int local_40;
  undefined4 uStack_3c;
  int *local_38;
  uint local_30;
  undefined4 uStack_2c;
  int *local_28;
  
  uVar12 = (uint)param_3[1] >> 3;
  if (uVar12 == 0) {
    return 0;
  }
  uVar8 = 0;
  uVar9 = uVar12;
  uVar2 = *(undefined4 *)(param_1 + 4);
  while (uVar11 = uVar9, uStack_2c = uVar2, local_28 = param_3, uVar11 != 0) {
    local_30 = uVar8 + (uVar11 >> 1);
    uVar1 = FUN_00025224(&local_30);
    uVar9 = uVar11 >> 1;
    if (uVar1 <= param_2) {
      uVar8 = local_30 + 1;
      uVar9 = uVar11 + ~(uVar11 >> 1);
      param_3 = local_28;
      uVar2 = uStack_2c;
    }
  }
  if (uVar8 == 0) {
    return 0;
  }
  _local_40 = CONCAT44(uVar2,uVar8 - 1);
  local_38 = param_3;
  local_30 = uVar8;
  uVar2 = FUN_00025224(&local_40);
  if (uVar8 == uVar12) {
    uVar3 = 0xffffffff;
  }
  else {
    uVar3 = FUN_00025224();
  }
  uVar12 = *local_38 + local_40 * 8;
  puVar5 = (uint *)(uVar12 + 4);
  if (puVar5 != (uint *)0x0) {
    uVar12 = *puVar5;
  }
  if (puVar5 == (uint *)0x0 || uVar12 == 1) {
    return 0;
  }
  uVar9 = uVar12;
  if ((int)uVar12 < 0) {
LAB_00025158:
    uVar8 = (uVar9 & 0xfffffff) >> 0x18;
    if (uVar8 == 2) {
      uVar8 = 2;
      piVar7 = (int *)(DAT_00025210 + 0x25188);
    }
    else {
      if (uVar8 != 1) {
        if (uVar8 != 0) {
          puVar10 = *(undefined4 **)(DAT_00025200 + 0x251dc);
          fprintf((FILE *)*puVar10,(char *)(DAT_00025204 + 0x251e8),DAT_00025208 + 0x251ea,
                  DAT_0002520c + 0x251ec);
          fflush((FILE *)*puVar10);
                    /* WARNING: Subroutine does not return */
          abort();
        }
        puVar4 = puVar5 + 1;
        if ((int)uVar12 < 0) {
          puVar4 = (uint *)0x0;
        }
        iVar6 = *(int *)(DAT_000251fc + 0x25174);
        goto LAB_00025174;
      }
      uVar8 = 0;
      piVar7 = (int *)(DAT_000251f8 + 0x25180);
    }
    iVar6 = *piVar7;
    uVar9 = (uVar9 & 0xffffff) >> 0x10;
    puVar4 = puVar5 + uVar9 + 1;
    if ((0x7fffffff < uVar12) && (uVar9 != 0)) {
      puVar10 = *(undefined4 **)(DAT_00025214 + 0x251ba);
      fprintf((FILE *)*puVar10,(char *)(DAT_00025218 + 0x251c6),DAT_0002521c + 0x251c8,
              DAT_00025220 + 0x251ca);
      fflush((FILE *)*puVar10);
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
  else {
    uVar9 = uVar12 | (uVar12 & 0x40000000) << 1;
    puVar4 = (uint *)(uVar9 + (int)puVar5);
    uVar9 = *(uint *)(uVar9 + (int)puVar5);
    puVar5 = puVar4;
    if ((int)uVar9 < 0) goto LAB_00025158;
    iVar6 = (int)puVar4 + (uVar9 & 0x40000000) * 2 + uVar9;
    puVar4 = puVar4 + *(byte *)((int)puVar4 + 7) + 2;
LAB_00025174:
    uVar8 = 0;
  }
  *(undefined4 *)(param_1 + 0x158) = uVar2;
  *(undefined4 *)(param_1 + 0x15c) = uVar3;
  *(uint *)(param_1 + 0x16c) = uVar8 | uVar12 >> 0x1f;
  *(uint **)(param_1 + 0x178) = puVar5;
  *(uint **)(param_1 + 0x160) = puVar4;
  *(int *)(param_1 + 0x164) = iVar6;
  return 1;
}




// ============================================================
// Function #477
// Name: FUN_00025224
// Address: 00025224
// JNI: NO
// ============================================================


int FUN_00025224(int *param_1)

{
  uint uVar1;
  
  uVar1 = *(uint *)(*(int *)param_1[2] + *param_1 * 8);
  return *(int *)param_1[2] + *param_1 * 8 + (uVar1 | (uVar1 & 0x40000000) << 1);
}




// ============================================================
// Function #478
// Name: FUN_00025684
// Address: 00025684
// JNI: NO
// ============================================================


undefined4 FUN_00025684(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 unaff_r4;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r8;
  undefined4 unaff_r9;
  undefined4 unaff_r10;
  undefined4 unaff_r11;
  undefined4 in_r12;
  undefined4 unaff_lr;
  
  *(int *)param_1 = param_1;
  *(undefined4 *)(param_1 + 4) = param_2;
  *(undefined4 *)(param_1 + 8) = param_3;
  *(undefined4 *)(param_1 + 0xc) = param_4;
  *(undefined4 *)(param_1 + 0x10) = unaff_r4;
  *(undefined4 *)(param_1 + 0x14) = unaff_r5;
  *(undefined4 *)(param_1 + 0x18) = unaff_r6;
  *(undefined4 *)(param_1 + 0x1c) = unaff_r7;
  *(undefined4 *)(param_1 + 0x20) = unaff_r8;
  *(undefined4 *)(param_1 + 0x24) = unaff_r9;
  *(undefined4 *)(param_1 + 0x28) = unaff_r10;
  *(undefined4 *)(param_1 + 0x2c) = unaff_r11;
  *(undefined4 *)(param_1 + 0x30) = in_r12;
  *(BADSPACEBASE **)(param_1 + 0x34) = register0x00000054;
  *(undefined4 *)(param_1 + 0x38) = unaff_lr;
  *(undefined4 *)(param_1 + 0x3c) = unaff_lr;
  return 0;
}




// ============================================================
// Function #479
// Name: FUN_0002569c
// Address: 0002569c
// JNI: NO
// ============================================================


void FUN_0002569c(undefined8 *param_1)

{
  undefined8 in_d0;
  undefined8 in_d1;
  undefined8 in_d2;
  undefined8 in_d3;
  undefined8 in_d4;
  undefined8 in_d5;
  undefined8 in_d6;
  undefined8 in_d7;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined8 unaff_d10;
  undefined8 unaff_d11;
  undefined8 unaff_d12;
  undefined8 unaff_d13;
  undefined8 unaff_d14;
  undefined8 unaff_d15;
  
  *param_1 = in_d0;
  param_1[1] = in_d1;
  param_1[2] = in_d2;
  param_1[3] = in_d3;
  param_1[4] = in_d4;
  param_1[5] = in_d5;
  param_1[6] = in_d6;
  param_1[7] = in_d7;
  param_1[8] = unaff_d8;
  param_1[9] = unaff_d9;
  param_1[10] = unaff_d10;
  param_1[0xb] = unaff_d11;
  param_1[0xc] = unaff_d12;
  param_1[0xd] = unaff_d13;
  param_1[0xe] = unaff_d14;
  param_1[0xf] = unaff_d15;
  return;
}




// ============================================================
// Function #480
// Name: FUN_000256a4
// Address: 000256a4
// JNI: NO
// ============================================================


void FUN_000256a4(undefined8 *param_1)

{
  undefined8 in_d0;
  undefined8 in_d1;
  undefined8 in_d2;
  undefined8 in_d3;
  undefined8 in_d4;
  undefined8 in_d5;
  undefined8 in_d6;
  undefined8 in_d7;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined8 unaff_d10;
  undefined8 unaff_d11;
  undefined8 unaff_d12;
  undefined8 unaff_d13;
  undefined8 unaff_d14;
  undefined8 unaff_d15;
  
  *param_1 = in_d0;
  param_1[1] = in_d1;
  param_1[2] = in_d2;
  param_1[3] = in_d3;
  param_1[4] = in_d4;
  param_1[5] = in_d5;
  param_1[6] = in_d6;
  param_1[7] = in_d7;
  param_1[8] = unaff_d8;
  param_1[9] = unaff_d9;
  param_1[10] = unaff_d10;
  param_1[0xb] = unaff_d11;
  param_1[0xc] = unaff_d12;
  param_1[0xd] = unaff_d13;
  param_1[0xe] = unaff_d14;
  param_1[0xf] = unaff_d15;
  return;
}




