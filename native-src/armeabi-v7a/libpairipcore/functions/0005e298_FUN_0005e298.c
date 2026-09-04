/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005e298
 * Address  : 0005e298
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005e298(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  int iVar6;
  undefined4 *puVar7;
  undefined1 *puVar8;
  int *piVar9;
  uint uVar10;
  undefined1 *puVar11;
  undefined4 *puVar12;
  int iVar13;
  undefined1 *puVar14;
  uint uVar15;
  int local_58;
  int local_54;
  int local_50;
  uint local_4c;
  uint local_48;
  undefined1 *local_44;
  uint local_40;
  uint local_3c;
  undefined1 *local_38;
  int local_34;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005e810 + 0x5e2ac);
  puVar7 = (undefined4 *)FUN_000a0398(0xd);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x2f;
  *(undefined1 *)((int)puVar7 + 1) = 100;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 2) = 0x65;
  *(undefined1 *)((int)puVar7 + 3) = 0x76;
  *(undefined4 *)((int)puVar7 + 5) = 0;
  *(undefined1 *)(puVar7 + 1) = 0x2f;
  *(undefined1 *)((int)puVar7 + 5) = 0x75;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined4 *)((int)puVar7 + 9) = 0;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0x6e;
  *(undefined1 *)((int)puVar7 + 9) = 100;
  *(undefined1 *)((int)puVar7 + 10) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x6d;
  *(undefined1 *)(puVar7 + 3) = 0;
  puVar8 = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar7 + 1);
  uVar2 = *(undefined1 *)((int)puVar7 + 2);
  uVar3 = *(undefined1 *)((int)puVar7 + 3);
  uVar4 = *(undefined1 *)(puVar7 + 1);
  *puVar8 = *(undefined1 *)puVar7;
  uVar5 = *(undefined1 *)((int)puVar7 + 5);
  puVar8[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 6);
  puVar8[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 7);
  puVar8[3] = uVar3;
  uVar3 = *(undefined1 *)(puVar7 + 2);
  puVar8[4] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 9);
  puVar8[5] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 10);
  puVar8[6] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0xb);
  puVar8[10] = uVar5;
  puVar8[7] = uVar2;
  puVar8[8] = uVar3;
  puVar8[9] = uVar4;
  puVar8[0xc] = 0;
  puVar8[0xb] = uVar1;
  FUN_00023f74(puVar7);
  piVar9 = (int *)FUN_00025e6c(DAT_0005e814 + 0x5e3b4);
  do {
    while (uVar10 = FUN_00019718(0x142,0xffffff9c,puVar8,0,0), uVar10 < 0xfffff001) {
      if (uVar10 < 0x80000000) {
        piVar9 = (int *)FUN_000a0370(0xc);
        iVar13 = DAT_0005e820 + 0x5e44c;
        piVar9[2] = DAT_0005e81c + 0x5e448;
        *piVar9 = iVar13;
        piVar9[1] = uVar10;
        goto LAB_0005e450;
      }
      if (*piVar9 != 4) goto LAB_0005e400;
    }
    *piVar9 = -uVar10;
  } while (uVar10 == 0xfffffffc);
LAB_0005e400:
  piVar9 = (int *)FUN_000a0370(4);
  *piVar9 = DAT_0005e818 + 0x5e420;
LAB_0005e450:
  puVar7 = (undefined4 *)FUN_000a0370(4);
  *puVar7 = piVar9;
  FUN_00023f68(puVar8,0x10);
  (**(code **)(*piVar9 + 8))(&local_34,piVar9,0x100);
  iVar6 = local_30;
  iVar13 = local_34;
  uVar10 = local_30 - local_34;
  if (uVar10 < 0xfffffff8) {
    if (uVar10 < 0xb) {
      puVar8 = (undefined1 *)((uint)&local_40 | 1);
      local_40 = CONCAT31(local_40._1_3_,(char)uVar10 * '\x02');
    }
    else {
      puVar8 = (undefined1 *)FUN_000a0370((uVar10 | 7) + 1);
      local_40 = (uVar10 | 7) + 2;
      local_3c = uVar10;
      local_38 = puVar8;
    }
    if (iVar13 != iVar6) {
      __aeabi_memcpy(puVar8,iVar13,uVar10);
      puVar8 = puVar8 + uVar10;
    }
    piVar9 = (int *)*puVar7;
    *puVar8 = 0;
    (**(code **)(*piVar9 + 8))(&local_58,piVar9,0x100);
    iVar13 = local_58;
    uVar10 = local_54 - local_58;
    if (uVar10 < 0xfffffff8) {
      if (uVar10 < 0xb) {
        puVar8 = (undefined1 *)((uint)&local_4c | 1);
        local_4c = CONCAT31(local_4c._1_3_,(char)uVar10 * '\x02');
      }
      else {
        puVar8 = (undefined1 *)FUN_000a0370((uVar10 | 7) + 1);
        local_4c = (uVar10 | 7) + 2;
        local_48 = uVar10;
        local_44 = puVar8;
      }
      if (iVar13 != local_54) {
        __aeabi_memcpy(puVar8,iVar13,uVar10);
        puVar8 = puVar8 + uVar10;
      }
      *puVar8 = 0;
      puVar11 = (undefined1 *)FUN_000a0370(0x48);
      *puVar11 = 0;
      puVar11[1] = 0;
      puVar11[2] = 0;
      puVar11[3] = 0;
      puVar11[4] = 0;
      puVar11[5] = 0;
      puVar11[6] = 0;
      puVar11[7] = 0;
      puVar11[8] = 0;
      puVar11[9] = 0;
      puVar11[10] = 0;
      puVar11[0xb] = 0;
      puVar11[0xc] = 0;
      puVar11[0xd] = 0;
      puVar11[0xe] = 0;
      puVar11[0xf] = 0;
      puVar11[0x10] = 0;
      puVar11[0x11] = 0;
      puVar11[0x12] = 0;
      puVar11[0x13] = 0;
      puVar11[0x14] = 0;
      puVar11[0x15] = 0;
      puVar11[0x16] = 0;
      puVar11[0x17] = 0;
      puVar11[0x18] = 0;
      puVar11[0x19] = 0;
      puVar11[0x1a] = 0;
      puVar11[0x1b] = 0;
      puVar11[0x1c] = 0;
      puVar11[0x1d] = 0;
      puVar11[0x1e] = 0;
      puVar11[0x1f] = 0;
      puVar11[0x20] = 1;
      puVar11[0x21] = 1;
      puVar11[0x22] = 1;
      puVar11[0x23] = 1;
      puVar11[0x24] = 1;
      puVar11[0x25] = 1;
      puVar11[0x26] = 1;
      puVar11[0x27] = 1;
      puVar11[0x28] = 1;
      puVar11[0x29] = 1;
      puVar11[0x2a] = 1;
      puVar11[0x2b] = 1;
      puVar11[0x2c] = 1;
      puVar11[0x2d] = 1;
      puVar11[0x2e] = 1;
      puVar11[0x2f] = 1;
      puVar11[0x30] = 1;
      puVar11[0x31] = 1;
      puVar11[0x32] = 1;
      puVar11[0x33] = 1;
      puVar11[0x34] = 1;
      puVar11[0x35] = 1;
      puVar11[0x36] = 1;
      puVar11[0x37] = 1;
      puVar11[0x38] = 1;
      puVar11[0x39] = 1;
      puVar11[0x3a] = 1;
      puVar11[0x3b] = 1;
      puVar11[0x3c] = 1;
      puVar11[0x3d] = 1;
      puVar11[0x3e] = 1;
      puVar11[0x3f] = 1;
      iVar13 = DAT_0005e824;
      *(undefined4 *)(puVar11 + 0x40) = 1;
      uVar10 = local_48;
      puVar8 = local_44;
      if ((local_4c & 1) == 0) {
        puVar8 = (undefined1 *)((uint)&local_4c | 1);
        uVar10 = local_4c >> 1 & 0x7f;
      }
      uVar15 = local_3c;
      puVar14 = local_38;
      if ((local_40 & 1) == 0) {
        puVar14 = (undefined1 *)((uint)&local_40 | 1);
        uVar15 = local_40 >> 1 & 0x7f;
      }
      *(undefined4 *)(puVar11 + 0x44) = 0;
      FUN_0002da50(puVar11,0,puVar14,uVar15,puVar8,uVar10,iVar13 + 0x5e6ec,0);
      if (uVar15 != 0 || uVar10 != 0) {
        FUN_0002da50(puVar11,1,puVar14,uVar15,puVar8,uVar10,iVar13 + 0x5e6ec,0);
      }
      if ((local_4c & 1) != 0) {
        FUN_00023f68(local_44,local_4c & 0xfffffffe);
      }
      if (local_58 != 0) {
        FUN_00023f68(local_58,local_50 - local_58);
      }
      if ((local_40 & 1) != 0) {
        FUN_00023f68(local_38,local_40 & 0xfffffffe);
      }
      if (local_34 != 0) {
        local_30 = local_34;
        FUN_00023f68(local_34,local_2c - local_34);
      }
      puVar12 = (undefined4 *)FUN_000a0370(0x20);
      iVar13 = DAT_0005e828;
      *puVar12 = puVar11;
      puVar12[1] = puVar7;
      puVar12[2] = iVar13 + 0x5e79c;
      puVar12[6] = puVar12 + 2;
      if (**(int **)(DAT_0005e82c + 0x5e7b0) != local_28) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}


