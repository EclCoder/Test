/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002747c
 * Address  : 0002747c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002747c(undefined4 param_1,int param_2)

{
  uint uVar1;
  int iVar2;
  bool bVar3;
  undefined8 *local_d8;
  undefined8 *puStack_d4;
  undefined1 local_d0;
  undefined1 local_cf;
  undefined1 local_ce;
  undefined1 local_cd;
  undefined1 local_cc;
  undefined1 local_cb;
  undefined1 local_ca;
  undefined1 local_c9;
  undefined1 local_c8;
  undefined1 local_c7;
  undefined1 local_c6;
  undefined1 local_c5;
  undefined1 local_c4;
  undefined1 local_c3;
  undefined1 local_c2;
  undefined1 local_c1;
  undefined1 local_c0;
  undefined1 local_bf;
  undefined1 local_be;
  undefined1 local_bd;
  undefined1 local_bc;
  undefined1 local_bb;
  undefined1 local_ba;
  undefined1 local_b9;
  undefined1 local_b8;
  undefined1 local_b7;
  undefined1 local_b6;
  undefined1 local_b5;
  undefined1 local_b4;
  undefined1 local_b3;
  undefined1 local_b2;
  undefined1 local_b1;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  uint local_88;
  int iStack_84;
  undefined4 local_80;
  undefined4 uStack_7c;
  undefined4 local_78;
  int iStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 local_68;
  int iStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 local_58;
  int iStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined4 local_48;
  undefined4 local_44;
  undefined1 auStack_40 [36];
  int local_1c;
  
  local_1c = **(int **)(DAT_00027b4c + 0x27498);
  FUN_00028788(&local_d0);
  iStack_84 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  local_80 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_7c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  iVar2 = 0;
  local_44 = 0;
  local_b0 = *(undefined8 *)(DAT_00027b50 + 0x274c0);
  uStack_a8 = *(undefined8 *)(DAT_00027b50 + 0x274c8);
  local_a0 = *(undefined8 *)(DAT_00027b50 + 0x274d0);
  uStack_98 = *(undefined8 *)(DAT_00027b50 + 0x274d8);
  local_90 = *(undefined8 *)(DAT_00027b50 + 0x274e0);
  local_88 = 0;
  local_78 = 0;
  local_68 = 0;
  local_58 = 0;
  local_48 = 0;
  local_d8 = &local_b0;
  puStack_d4 = &uStack_a8;
  iStack_74 = iStack_84;
  uStack_70 = local_80;
  uStack_6c = uStack_7c;
  iStack_64 = iStack_84;
  uStack_60 = local_80;
  uStack_5c = uStack_7c;
  iStack_54 = iStack_84;
  uStack_50 = local_80;
  uStack_4c = uStack_7c;
  FUN_0002737c(auStack_40,&local_d8);
  uVar1 = local_88 & 0x3f;
  iStack_84 = iStack_84 + (uint)(0xffffffbf < local_88);
  local_88 = local_88 + 0x40;
  do {
    *(undefined1 *)((int)&local_80 + uVar1) = *(undefined1 *)(param_2 + 0x68 + iVar2);
    uVar1 = uVar1 + 1;
    if (uVar1 == 0x40) {
      FUN_000284f4(&local_88);
      uVar1 = 0;
    }
    iVar2 = iVar2 + 1;
  } while (iVar2 != 0x40);
  uVar1 = local_88 & 0x3f;
  bVar3 = 0xffffffdf < local_88;
  local_88 = local_88 + 0x20;
  iStack_84 = iStack_84 + (uint)bVar3;
  *(undefined1 *)((int)&local_80 + uVar1) = local_d0;
  if (uVar1 == 0x3f) {
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_cf);
    iVar2 = 1;
LAB_000275cc:
    *(undefined1 *)((int)&local_80 + iVar2) = local_ce;
    iVar2 = iVar2 + 1;
LAB_000275d8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_cd;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027650;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_cc;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_0002765c;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_cb);
    iVar2 = 1;
LAB_0002767c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_ca;
    iVar2 = iVar2 + 1;
LAB_000276b8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c9;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000276d8;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c8;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027714;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c7);
    iVar2 = 1;
LAB_00027734:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c6;
    iVar2 = iVar2 + 1;
LAB_00027770:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c5;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027790;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c4;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000277cc;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c3);
    iVar2 = 1;
LAB_000277ec:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c2;
    iVar2 = iVar2 + 1;
LAB_00027828:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c1;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027848;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c0;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027884;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_bf);
    iVar2 = 1;
LAB_000278a4:
    *(undefined1 *)((int)&local_80 + iVar2) = local_be;
    iVar2 = iVar2 + 1;
LAB_000278e0:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bd;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027900;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_bc;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_0002793c;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_bb);
    iVar2 = 1;
LAB_0002795c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_ba;
    iVar2 = iVar2 + 1;
LAB_00027998:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b9;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000279b8;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b8;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000279f4;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b7);
    iVar2 = 1;
LAB_00027a14:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b6;
    iVar2 = iVar2 + 1;
LAB_00027a50:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b5;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027a70;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b4;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027aac;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b3);
    iVar2 = 1;
LAB_00027acc:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b2;
    iVar2 = iVar2 + 1;
  }
  else {
    *(undefined1 *)((int)&local_80 + uVar1 + 1) = local_cf;
    if (uVar1 == 0x3e) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000275cc;
    }
    *(undefined1 *)((int)&local_80 + uVar1 + 2) = local_ce;
    iVar2 = uVar1 + 3;
    if (iVar2 != 0x40) goto LAB_000275d8;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_cd);
    iVar2 = 1;
LAB_00027650:
    *(undefined1 *)((int)&local_80 + iVar2) = local_cc;
    iVar2 = iVar2 + 1;
LAB_0002765c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_cb;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_0002767c;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_ca;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000276b8;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c9);
    iVar2 = 1;
LAB_000276d8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c8;
    iVar2 = iVar2 + 1;
LAB_00027714:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c7;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027734;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c6;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027770;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c5);
    iVar2 = 1;
LAB_00027790:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c4;
    iVar2 = iVar2 + 1;
LAB_000277cc:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c3;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000277ec;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c2;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027828;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c1);
    iVar2 = 1;
LAB_00027848:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c0;
    iVar2 = iVar2 + 1;
LAB_00027884:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bf;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000278a4;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_be;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000278e0;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_bd);
    iVar2 = 1;
LAB_00027900:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bc;
    iVar2 = iVar2 + 1;
LAB_0002793c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bb;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_0002795c;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_ba;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027998;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b9);
    iVar2 = 1;
LAB_000279b8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b8;
    iVar2 = iVar2 + 1;
LAB_000279f4:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b7;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027a14;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b6;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027a50;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b5);
    iVar2 = 1;
LAB_00027a70:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b4;
    iVar2 = iVar2 + 1;
LAB_00027aac:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b3;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027acc;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b2;
    if (iVar2 != 0x3e) {
      *(undefined1 *)((int)&local_80 + iVar2 + 2) = local_b1;
      if (iVar2 == 0x3d) {
        FUN_000284f4(&local_88);
      }
      goto LAB_00027b04;
    }
    FUN_000284f4(&local_88);
    iVar2 = 0;
  }
  *(undefined1 *)((int)&local_80 + iVar2) = local_b1;
LAB_00027b04:
  FUN_00028788(param_1,&local_88);
  if (**(int **)(DAT_00027b54 + 0x27b20) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


