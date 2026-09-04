/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005ed20
 * Address  : 0005ed20
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005ed20(int *param_1,int param_2)

{
  uint uVar1;
  undefined4 *puVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  __start_routine *__start_routine;
  uint uVar6;
  undefined4 uVar7;
  undefined1 *puVar8;
  int iVar9;
  undefined4 *puVar10;
  int *piVar11;
  undefined4 *puVar12;
  int iVar13;
  int iVar14;
  undefined1 uStack_89;
  undefined1 local_88 [40];
  int local_60;
  undefined1 *local_58;
  char local_54;
  int local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_0005f1e8 + 0x5ed40);
  FUN_0001ae24(param_1 + 1);
  iVar3 = DAT_0005f1ec;
  puVar10 = (undefined4 *)*param_1;
  if (puVar10 != (undefined4 *)0x0) goto LAB_0005f0cc;
  DataMemoryBarrier(0xb);
  if ((*(byte *)(DAT_0005f1ec + 0x5ed98) & 1) == 0) {
    iVar9 = DAT_0005f1ec + 0x5ed98;
    iVar4 = FUN_0001b094(iVar9);
    if (iVar4 != 0) {
      piVar11 = (int *)FUN_000a0370(0x20);
      iVar4 = DAT_0005f1f4;
      iVar13 = DAT_0005f1f0 + 0x5f1ac;
      piVar11[3] = DAT_0005f1f8 + 0x5f1b0;
      *(undefined1 *)(piVar11 + 1) = 1;
      piVar11[2] = iVar13;
      piVar11[6] = (int)(piVar11 + 2);
      *piVar11 = iVar4 + 0x5f1b0;
      *(int **)(iVar3 + 0x5ed9c) = piVar11;
      FUN_0001b14c(iVar9);
    }
  }
  uVar7 = *(undefined4 *)(iVar3 + 0x5ed9c);
  puVar10 = (undefined4 *)FUN_000a0370(0x34);
  puVar10[10] = 0;
  *puVar10 = 0;
  puVar10[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar10[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar10[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar10[4] = 0;
  puVar10[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar10[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar10[7] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar10[8] = uVar7;
  *(undefined4 *)((int)puVar10 + 0x2d) = 0;
  *(undefined4 *)((int)puVar10 + 0x29) = 0;
  piVar11 = puVar10 + 9;
  *piVar11 = 0;
  uVar7 = FUN_000a0370(4);
  FUN_0001afe8();
  puVar2 = (undefined4 *)FUN_000a0370(8);
  __start_routine = (__start_routine *)(DAT_0005f1fc + 0x5ede0);
  *puVar2 = uVar7;
  puVar2[1] = puVar10;
  iVar3 = pthread_create((pthread_t *)&local_58,(pthread_attr_t *)0x0,__start_routine,puVar2);
  if (iVar3 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001ac4c(iVar3,DAT_0005f214 + 0x5f1e4);
  }
  if (*piVar11 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b280();
  }
  puVar10[9] = local_58;
  local_58 = (undefined1 *)0x0;
  FUN_0001ae60(&local_58);
  FUN_0001aea8(piVar11);
  iVar3 = *param_1;
  *param_1 = (int)puVar10;
  if (iVar3 == 0) goto LAB_0005f0cc;
  DataMemoryBarrier(0xb);
  if ((*(byte *)(iVar3 + 0x30) & 1) == 0) {
    local_30 = 2;
    FUN_0005f218(iVar3,&local_58);
    if (local_30 != -1) {
      (**(code **)(DAT_0005f200 + 0x5ee68 + local_30 * 4))(&uStack_89,&local_58);
    }
  }
  puVar8 = (undefined1 *)(iVar3 + 0x2c);
  local_54 = '\x01';
  local_58 = puVar8;
  FUN_0001ae24(puVar8);
  DataMemoryBarrier(0xb);
  if ((*(byte *)(iVar3 + 0x30) & 1) == 0) {
    do {
      FUN_0001ade0(iVar3 + 0x28,&local_58);
      DataMemoryBarrier(0xb);
    } while ((*(byte *)(iVar3 + 0x30) & 1) == 0);
  }
  if (local_54 == '\x01') {
    FUN_0001ae3c(local_58);
  }
  piVar11 = (int *)(iVar3 + 0x24);
  if (*piVar11 != 0) {
    FUN_0001ae70(piVar11);
  }
  FUN_0001ae24(puVar8);
  FUN_0001ae3c(puVar8);
  FUN_0001ae10(puVar8);
  FUN_0001adb0(iVar3 + 0x28);
  FUN_0001ae60(piVar11);
  puVar2 = *(undefined4 **)(iVar3 + 0xc);
  puVar10 = puVar2;
  if (*(undefined4 **)(iVar3 + 0x10) != puVar2) {
    uVar6 = *(uint *)(iVar3 + 0x18);
    uVar5 = *(int *)(iVar3 + 0x1c) + uVar6;
    piVar11 = puVar2 + uVar6 / 0x55;
    iVar4 = *piVar11;
    uVar1 = uVar5 / 0x55;
    iVar9 = iVar4 + (uVar6 / 0x55) * -0xff0 + uVar6 * 0x30;
    iVar13 = puVar2[uVar1] + uVar1 * -0xff0 + uVar5 * 0x30;
    puVar10 = *(undefined4 **)(iVar3 + 0x10);
    if (iVar9 != iVar13) {
      iVar14 = DAT_0005f204 + 0x5efa0;
      do {
        if (*(int *)(iVar9 + 0x28) != -1) {
          (**(code **)(iVar14 + *(int *)(iVar9 + 0x28) * 4))(&local_58,iVar9);
          iVar4 = *piVar11;
        }
        *(undefined4 *)(iVar9 + 0x28) = 0xffffffff;
        iVar9 = iVar9 + 0x30;
        if (iVar9 - iVar4 == 0xff0) {
          piVar11 = piVar11 + 1;
          iVar9 = *piVar11;
          iVar4 = iVar9;
        }
      } while (iVar9 != iVar13);
      puVar2 = *(undefined4 **)(iVar3 + 0xc);
      puVar10 = *(undefined4 **)(iVar3 + 0x10);
    }
  }
  *(undefined4 *)(iVar3 + 0x1c) = 0;
  iVar4 = (int)puVar10 - (int)puVar2;
  while (uVar1 = iVar4 >> 2, 2 < uVar1) {
    FUN_00023f68(*puVar2,0xff0);
    puVar10 = *(undefined4 **)(iVar3 + 0x10);
    puVar2 = (undefined4 *)(*(int *)(iVar3 + 0xc) + 4);
    *(undefined4 **)(iVar3 + 0xc) = puVar2;
    iVar4 = (int)puVar10 - (int)puVar2;
  }
  if (uVar1 == 1) {
    uVar7 = 0x2a;
LAB_0005f05c:
    *(undefined4 *)(iVar3 + 0x18) = uVar7;
  }
  else if (uVar1 == 2) {
    uVar7 = 0x55;
    goto LAB_0005f05c;
  }
  if (puVar2 != puVar10) {
    do {
      puVar12 = puVar2 + 1;
      FUN_00023f68(*puVar2,0xff0);
      puVar2 = puVar12;
    } while (puVar12 != puVar10);
    iVar4 = *(int *)(iVar3 + 0x10);
    if (*(int *)(iVar3 + 0xc) != iVar4) {
      *(uint *)(iVar3 + 0x10) = iVar4 + ((*(int *)(iVar3 + 0xc) - iVar4) + 3U & 0xfffffffc);
    }
  }
  iVar4 = *(int *)(iVar3 + 8);
  if (iVar4 != 0) {
    FUN_00023f68(iVar4,*(int *)(iVar3 + 0x14) - iVar4);
  }
  FUN_0001ae10(iVar3 + 4);
  uVar7 = FUN_0001adb0(iVar3);
  FUN_00023f68(uVar7,0x34);
  puVar10 = (undefined4 *)*param_1;
LAB_0005f0cc:
  iVar3 = *(int *)(param_2 + 0x28);
  local_60 = -1;
  local_88[0] = 0;
  if (iVar3 != -1) {
    local_58 = local_88;
    (**(code **)(DAT_0005f208 + 0x5f100 + iVar3 * 4))(&local_58,param_2);
    local_60 = iVar3;
  }
  FUN_0005f218(puVar10,local_88);
  if (local_60 != -1) {
    (**(code **)(DAT_0005f20c + 0x5f130 + local_60 * 4))(&local_58,local_88);
  }
  local_60 = 0xffffffff;
  FUN_0001ae3c(param_1 + 1);
  if (**(int **)(DAT_0005f210 + 0x5f15c) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


