// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 421-440
// ============================================================

// ============================================================
// Function #421
// Name: FUN_00023c30
// Address: 00023c30
// JNI: NO
// ============================================================


void FUN_00023c30(int param_1,undefined4 param_2)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 8);
  if (*(char *)(iVar1 + 4) == '\v') {
    iVar1 = FUN_00023c8c();
    if (iVar1 != 0) {
      return;
    }
    iVar1 = *(int *)(param_1 + 8);
  }
  iVar1 = FUN_0001ead4(iVar1,param_2);
  if ((iVar1 != 0) || (iVar1 = FUN_0001eaf4(*(undefined4 *)(param_1 + 8),param_2), iVar1 != 0)) {
    FUN_0001dcd6(param_2,DAT_00023c78 + 0x23c66,1);
  }
                    /* WARNING: Could not recover jumptable at 0x00023c74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 8) + 0x14))(*(int **)(param_1 + 8),param_2);
  return;
}




// ============================================================
// Function #422
// Name: FUN_00023c7c
// Address: 00023c7c
// JNI: NO
// ============================================================


void FUN_00023c7c(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #423
// Name: FUN_00023c8c
// Address: 00023c8c
// JNI: NO
// ============================================================


void FUN_00023c8c(int param_1)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 8);
  if (*(char *)(iVar1 + 4) == '\b') {
    FUN_0001d2ce(*(undefined4 *)(iVar1 + 8),*(undefined4 *)(iVar1 + 0xc),DAT_00023cb0 + 0x23ca8,0xb)
    ;
    return;
  }
  return;
}




// ============================================================
// Function #424
// Name: FUN_00023cb4
// Address: 00023cb4
// JNI: NO
// ============================================================


void FUN_00023cb4(int param_1)

{
  FUN_0001eaae(*(undefined4 *)(param_1 + 8));
  return;
}




// ============================================================
// Function #425
// Name: FUN_00023d70
// Address: 00023d70
// JNI: NO
// ============================================================


void FUN_00023d70(int param_1,undefined4 param_2)

{
  int iVar1;
  undefined1 auStack_20 [4];
  int *local_1c;
  
  if (*(char *)(param_1 + 0x10) == '\0') {
    *(undefined1 *)(param_1 + 0x10) = 1;
    FUN_00023df0(auStack_20,param_1,param_2);
    if (local_1c != (int *)0x0) {
      iVar1 = FUN_0001ead4(local_1c,param_2);
      if ((iVar1 != 0) || (iVar1 = FUN_0001eaf4(local_1c,param_2), iVar1 != 0)) {
        FUN_0001dcd6(param_2,DAT_00023dd8 + 0x23db8,1);
      }
      (**(code **)(*local_1c + 0x14))(local_1c,param_2);
    }
    *(undefined1 *)(param_1 + 0x10) = 0;
  }
  return;
}




// ============================================================
// Function #426
// Name: FUN_00023ddc
// Address: 00023ddc
// JNI: NO
// ============================================================


void FUN_00023ddc(void)

{
  return;
}




// ============================================================
// Function #427
// Name: FUN_00023de2
// Address: 00023de2
// JNI: NO
// ============================================================


void FUN_00023de2(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #428
// Name: FUN_00023df0
// Address: 00023df0
// JNI: NO
// ============================================================


void FUN_00023df0(int *param_1,int param_2,undefined4 param_3)

{
  undefined4 *puVar1;
  int iVar2;
  undefined4 *puVar3;
  uint uVar4;
  int *piVar5;
  undefined4 *puVar6;
  int iVar7;
  undefined4 *local_50;
  undefined4 *local_4c;
  undefined4 *local_48;
  undefined4 local_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  undefined4 uStack_38;
  undefined4 local_34;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  
  piVar5 = *(int **)(param_2 + 8);
  iVar7 = *(int *)(param_2 + 0xc);
  uStack_40 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uStack_3c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_38 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  param_1[1] = (int)piVar5;
  local_44 = 0;
  local_34 = 0;
  local_48 = (undefined4 *)&stack0xffffffdc;
  local_50 = &local_44;
  local_4c = &local_44;
  uStack_30 = uStack_40;
  uStack_2c = uStack_3c;
  uStack_28 = uStack_38;
  do {
    do {
      iVar2 = (**(code **)(*piVar5 + 0xc))(piVar5,param_3);
      puVar1 = local_4c;
      puVar6 = local_50;
      if (*(char *)(iVar2 + 4) != '\r') {
        *param_1 = iVar7;
        param_1[1] = (int)piVar5;
        goto LAB_00023ec2;
      }
      piVar5 = *(int **)(iVar2 + 8);
      if (*(int *)(iVar2 + 0xc) < iVar7) {
        iVar7 = *(int *)(iVar2 + 0xc);
      }
      if (local_4c == local_48) {
        iVar2 = (int)local_4c - (int)local_50;
        if (local_50 == &local_44) {
          puVar3 = malloc(iVar2 * 2);
          if (puVar3 == (undefined4 *)0x0) {
            *param_1 = iVar7;
            param_1[1] = (int)piVar5;
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (puVar1 != &local_44) {
            __aeabi_memmove4(puVar3,puVar6,iVar2);
          }
        }
        else {
          puVar3 = realloc(local_50,iVar2 * 2);
          if (puVar3 == (undefined4 *)0x0) {
            *param_1 = iVar7;
            param_1[1] = (int)piVar5;
            local_50 = puVar3;
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        local_4c = (undefined4 *)((int)puVar3 + iVar2);
        local_48 = puVar3 + (iVar2 >> 1);
        local_50 = puVar3;
      }
      puVar6 = local_4c + 1;
      *local_4c = piVar5;
      uVar4 = (int)puVar6 - (int)local_50 >> 2;
      local_4c = puVar6;
    } while (uVar4 < 2);
    if (uVar4 <= uVar4 - 1 >> 1) {
      *param_1 = iVar7;
      param_1[1] = (int)piVar5;
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_00023f10 + 0x23ee2,DAT_00023f14 + 0x23ee4,0x94,DAT_00023f18 + 0x23ee6);
    }
  } while (piVar5 != (int *)local_50[uVar4 - 1 >> 1]);
  *param_1 = iVar7;
  param_1[1] = 0;
LAB_00023ec2:
  FUN_00023f1c(&local_50);
  return;
}




// ============================================================
// Function #429
// Name: FUN_00023f1c
// Address: 00023f1c
// JNI: NO
// ============================================================


undefined4 * FUN_00023f1c(undefined4 *param_1)

{
  if ((undefined4 *)*param_1 != param_1 + 3) {
    free((undefined4 *)*param_1);
  }
  return param_1;
}




// ============================================================
// Function #430
// Name: FUN_00023f34
// Address: 00023f34
// JNI: NO
// ============================================================


void FUN_00023f34(void)

{
  undefined4 uVar1;
  undefined4 extraout_r1;
  int unaff_r6;
  
  FUN_00023fdc(4);
  uVar1 = FUN_0001b440();
  FUN_000240ec(uVar1,*(undefined4 *)(iRam00023f54 + 0x23f4a),*(undefined4 *)(iRam00023f58 + 0x23f4c)
              );
  (*(code *)PTR_free_000a5f80)(extraout_r1,extraout_r1,unaff_r6 + -4);
  return;
}




// ============================================================
// Function #431
// Name: FUN_00023f5c
// Address: 00023f5c
// JNI: NO
// ============================================================


void FUN_00023f5c(void)

{
  (*(code *)PTR_free_000a5f80)();
  return;
}




// ============================================================
// Function #432
// Name: FUN_00023f68
// Address: 00023f68
// JNI: NO
// ============================================================


void FUN_00023f68(void)

{
  FUN_00023f5c();
  return;
}




// ============================================================
// Function #433
// Name: FUN_00023f74
// Address: 00023f74
// JNI: NO
// ============================================================


void FUN_00023f74(void)

{
  FUN_00023f5c();
  return;
}




// ============================================================
// Function #434
// Name: FUN_00023f80
// Address: 00023f80
// JNI: NO
// ============================================================


undefined4 FUN_00023f80(size_t param_1,size_t param_2)

{
  posix_memalign((void **)&stack0xfffffff4,param_1,param_2);
  return 0;
}




// ============================================================
// Function #435
// Name: FUN_00023f96
// Address: 00023f96
// JNI: NO
// ============================================================


void FUN_00023f96(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  undefined4 *puVar2;
  undefined1 auStack_2e0 [392];
  undefined1 auStack_158 [328];
  undefined4 uStack_10;
  undefined4 uStack_c;
  undefined4 uStack_8;
  
  uStack_10 = param_2;
  uStack_c = param_3;
  uStack_8 = param_4;
  iVar1 = FUN_0002418c();
  FUN_00025684(auStack_158,uStack_10,uStack_c,uStack_8);
  if (*(int *)(iVar1 + 0xc) == 0) {
    FUN_00024954(auStack_158,auStack_2e0,iVar1,1);
  }
  else {
    FUN_00024a88(auStack_158,auStack_2e0,iVar1,*(int *)(iVar1 + 0xc),*(undefined4 *)(iVar1 + 0x14));
  }
  puVar2 = *(undefined4 **)(DAT_00024a78 + 0x24a5c);
  fprintf((FILE *)*puVar2,(char *)(DAT_00024a7c + 0x24a68),DAT_00024a80 + 0x24a6a,
          DAT_00024a84 + 0x24a6c);
  fflush((FILE *)*puVar2);
                    /* WARNING: Subroutine does not return */
  abort();
}




// ============================================================
// Function #436
// Name: FUN_00023fa6
// Address: 00023fa6
// JNI: NO
// ============================================================


undefined8 FUN_00023fa6(undefined8 *param_1)

{
  return *param_1;
}




// ============================================================
// Function #437
// Name: FUN_00023fb0
// Address: 00023fb0
// JNI: NO
// ============================================================


bool FUN_00023fb0(uint *param_1)

{
  return (*param_1 >> 8 | param_1[1] << 0x18) == DAT_00023fd8 && DAT_00023fd4 == param_1[1] >> 8;
}




// ============================================================
// Function #438
// Name: FUN_00023fdc
// Address: 00023fdc
// JNI: NO
// ============================================================


int FUN_00023fdc(int param_1)

{
  int iVar1;
  uint uVar2;
  
  uVar2 = param_1 + 0x87U & 0xfffffff8;
  iVar1 = FUN_000256e0(uVar2);
  if (iVar1 != 0) {
    __aeabi_memclr8(iVar1,uVar2);
    return iVar1 + 0x80;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #439
// Name: FUN_00024006
// Address: 00024006
// JNI: NO
// ============================================================


uint * FUN_00024006(uint *param_1)

{
  int *piVar1;
  uint *puVar2;
  uint *puVar3;
  uint uVar4;
  uint uVar5;
  
  uVar5 = *param_1;
  uVar4 = param_1[1];
  piVar1 = (int *)FUN_0001b400();
  puVar2 = param_1 + -10;
  if (uVar4 >> 8 == 0x434c4e && (uVar5 >> 8 | uVar4 << 0x18) == 0x47432b2b) {
    uVar4 = param_1[-3];
    puVar3 = (uint *)*piVar1;
    if ((int)uVar4 < 0) {
      uVar4 = -uVar4;
    }
    param_1[-3] = uVar4 + 1;
    if (puVar2 != puVar3) {
      *piVar1 = (int)puVar2;
      param_1[-4] = (uint)puVar3;
    }
    piVar1[1] = piVar1[1] + -1;
    return (uint *)param_1[9];
  }
  if (*piVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b280(piVar1);
  }
  *piVar1 = (int)puVar2;
  return param_1 + 0x16;
}




// ============================================================
// Function #440
// Name: FUN_00024072
// Address: 00024072
// JNI: NO
// ============================================================


void FUN_00024072(int param_1)

{
  FUN_00025804(param_1 + -0x80);
  return;
}




