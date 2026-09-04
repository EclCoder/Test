/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : ExecuteProgram
 * Address  : 00076644
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void ExecuteProgram(char *param_1,undefined4 *param_2,uint param_3,uint param_4)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  char *pcVar7;
  int *piVar8;
  size_t sVar9;
  undefined4 *puVar10;
  int *piVar11;
  uint uVar12;
  undefined4 uVar13;
  uint uVar14;
  undefined1 *puVar15;
  int iVar16;
  undefined4 uVar17;
  undefined1 *puVar18;
  undefined4 uVar19;
  undefined1 *puVar20;
  bool bVar21;
  undefined8 uVar22;
  uint local_ac;
  uint local_a8;
  undefined1 *local_a0;
  undefined4 local_9c;
  undefined1 **local_90;
  uint local_88;
  undefined1 *local_80;
  undefined4 local_7c;
  undefined1 **local_70;
  uint local_68;
  undefined1 *local_60;
  undefined4 local_5c;
  undefined1 **local_50;
  uint local_48;
  size_t local_44;
  undefined1 *local_40;
  undefined4 local_3c;
  undefined1 **local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_00076e7c + 0x76670);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076e78 + 0x7666c);
  if (*pcVar7 == '\x01') {
    piVar8 = (int *)FUN_00025e6c(DAT_00076e80 + 0x76694);
    piVar8 = (int *)*piVar8;
  }
  else {
    piVar11 = (int *)FUN_00025e6c(DAT_00076e84 + 0x76d68);
    piVar8 = (int *)FUN_00076fc0();
    iVar16 = DAT_00076e88;
    *piVar11 = (int)piVar8;
    puVar18 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76d84);
    *puVar18 = 1;
  }
  if ((((piVar8 == (int *)0x0) || (*(char *)(DAT_00076e8c + 0x766b8) != '\x01')) ||
      (*(int *)(DAT_00076e90 + 0x766e8) == 0 || param_1 == (char *)0x0)) ||
     ((param_2 == (undefined4 *)0x0 && (param_3 != 0 || param_4 != 0) ||
      (*(int *)(DAT_00076e90 + 0x766e0) == 0)))) goto LAB_000766e0;
  sVar9 = strlen(param_1);
  if (0xfffffff7 < sVar9) {
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar9 < 0xb) {
    puVar18 = (undefined1 *)((uint)&local_48 | 1);
    local_48 = CONCAT31(local_48._1_3_,(char)(sVar9 << 1));
    if (sVar9 != 0) goto LAB_0007677c;
  }
  else {
    puVar18 = (undefined1 *)FUN_000a0370((sVar9 | 7) + 1);
    local_48 = (sVar9 | 7) + 2;
    local_44 = sVar9;
    local_40 = puVar18;
LAB_0007677c:
    __aeabi_memcpy(puVar18,param_1,sVar9);
  }
  iVar16 = DAT_00076e94;
  puVar18[sVar9] = 0;
  pcVar7 = (char *)FUN_00025e6c(iVar16 + 0x767a0);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076e98 + 0x767b8);
    piVar11 = (int *)*puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076e9c + 0x76da4);
    piVar11 = (int *)FUN_00076fc0();
    iVar16 = DAT_00076ea0;
    *puVar10 = piVar11;
    puVar18 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76dc0);
    *puVar18 = 1;
  }
  puVar20 = (undefined1 *)((uint)&local_48 | 1);
  puVar18 = local_40;
  if ((local_48 & 1) == 0) {
    puVar18 = puVar20;
  }
  uVar12 = (**(code **)(*piVar11 + 0x29c))(piVar11,puVar18);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076ea4 + 0x767ec);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ea8 + 0x76804);
    uVar17 = *puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076eac + 0x76de0);
    uVar17 = FUN_00076fc0();
    iVar16 = DAT_00076eb0;
    *puVar10 = uVar17;
    puVar18 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76dfc);
    *puVar18 = 1;
  }
  puVar18 = (undefined1 *)(DAT_00076eb4 + 0x76828);
  local_a8 = uVar12;
  local_a0 = puVar18;
  local_9c = uVar17;
  local_90 = &local_a0;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  puVar10 = (undefined4 *)FUN_000a0398(0x11);
  *puVar10 = 0;
  puVar10[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar10[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar10[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar10 = 0x6a;
  *(undefined1 *)((int)puVar10 + 1) = 0x61;
  *(undefined1 *)((int)puVar10 + 2) = 0x76;
  *(undefined1 *)((int)puVar10 + 3) = 0x61;
  *(undefined1 *)(puVar10 + 1) = 0x2f;
  *(undefined1 *)((int)puVar10 + 5) = 0x6c;
  *(undefined1 *)((int)puVar10 + 6) = 0x61;
  *(undefined1 *)((int)puVar10 + 7) = 0x6e;
  *(undefined1 *)(puVar10 + 2) = 0x67;
  *(undefined1 *)((int)puVar10 + 9) = 0x2f;
  *(undefined1 *)((int)puVar10 + 10) = 0x4f;
  *(undefined1 *)((int)puVar10 + 0xb) = 0x62;
  *(undefined1 *)(puVar10 + 3) = 0x6a;
  *(undefined1 *)((int)puVar10 + 0xd) = 0x65;
  *(undefined1 *)(puVar10 + 4) = 0;
  *(undefined1 *)((int)puVar10 + 0xe) = 99;
  *(undefined1 *)((int)puVar10 + 0xf) = 0x74;
  *(undefined1 *)(puVar10 + 4) = 0;
  local_40 = (undefined1 *)FUN_000a0370(0x18);
  uVar2 = *(undefined1 *)((int)puVar10 + 1);
  uVar3 = *(undefined1 *)((int)puVar10 + 2);
  uVar4 = *(undefined1 *)((int)puVar10 + 3);
  uVar5 = *(undefined1 *)(puVar10 + 1);
  *local_40 = *(undefined1 *)puVar10;
  uVar6 = *(undefined1 *)((int)puVar10 + 5);
  local_40[1] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar10 + 6);
  local_40[2] = uVar3;
  local_40[4] = uVar5;
  local_40[3] = uVar4;
  local_40[5] = uVar6;
  local_40[6] = uVar2;
  uVar2 = *(undefined1 *)(puVar10 + 2);
  local_44 = 0x10;
  uVar3 = *(undefined1 *)((int)puVar10 + 9);
  uVar4 = *(undefined1 *)((int)puVar10 + 10);
  local_48 = 0x19;
  uVar5 = *(undefined1 *)((int)puVar10 + 0xb);
  local_40[7] = *(undefined1 *)((int)puVar10 + 7);
  uVar6 = *(undefined1 *)(puVar10 + 3);
  local_40[8] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar10 + 0xd);
  local_40[9] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar10 + 0xe);
  local_40[10] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar10 + 0xf);
  local_40[0xb] = uVar5;
  local_40[0xc] = uVar6;
  local_40[0xd] = uVar2;
  local_40[0xe] = uVar3;
  local_40[0x10] = 0;
  local_40[0xf] = uVar4;
  FUN_00023f74(puVar10);
  puVar15 = local_40;
  if ((local_48 & 1) == 0) {
    puVar15 = puVar20;
  }
  uVar12 = (**(code **)(*piVar8 + 0x18))(piVar8,puVar15);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076eb8 + 0x769bc);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ebc + 0x769d4);
    uVar17 = *puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ec0 + 0x76e14);
    uVar17 = FUN_00076fc0();
    iVar16 = DAT_00076ec4;
    *puVar10 = uVar17;
    puVar20 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76e30);
    *puVar20 = 1;
  }
  local_68 = uVar12;
  local_60 = puVar18;
  local_5c = uVar17;
  local_50 = &local_60;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  uVar12 = (**(code **)(*piVar8 + 0x2b0))(piVar8,param_3,local_68,0);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076ec8 + 0x76a40);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ecc + 0x76a58);
    uVar17 = *puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ed0 + 0x76e48);
    uVar17 = FUN_00076fc0();
    iVar16 = DAT_00076ed4;
    *puVar10 = uVar17;
    puVar20 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76e64);
    *puVar20 = 1;
  }
  local_88 = uVar12;
  local_80 = puVar18;
  local_7c = uVar17;
  local_70 = &local_80;
  if (param_3 != 0 || param_4 != 0) {
    uVar22 = FUN_00025e6c(DAT_00076ed8 + 0x76a98);
    iVar16 = (int)((ulonglong)uVar22 >> 0x20);
    puVar10 = (undefined4 *)uVar22;
    uVar12 = 1;
    do {
      uVar1 = local_88;
      uVar17 = *param_2;
      uVar19 = param_2[1];
      pcVar7 = (char *)FUN_00025e6c(DAT_00076edc + 0x76ae8,iVar16);
      if (*pcVar7 == '\x01') {
        uVar13 = *puVar10;
      }
      else {
        uVar13 = FUN_00076fc0();
        *puVar10 = uVar13;
        puVar20 = (undefined1 *)FUN_00025e6c(DAT_00076ee8 + 0x76bcc);
        *puVar20 = 1;
      }
      uVar14 = FUN_00073564(uVar13,*(undefined4 *)(DAT_00076eec + 0x76b0c),
                            *(undefined4 *)(DAT_00076eec + 0x76b10),
                            *(undefined4 *)(DAT_00076eec + 0x76b10),uVar17,uVar19);
      pcVar7 = (char *)FUN_00025e6c(DAT_00076ef0 + 0x76b24);
      if (*pcVar7 == '\x01') {
        uVar17 = *puVar10;
      }
      else {
        uVar17 = FUN_00076fc0();
        *puVar10 = uVar17;
        puVar20 = (undefined1 *)FUN_00025e6c(DAT_00076ef4 + 0x76bf8);
        *puVar20 = 1;
      }
      local_48 = uVar14;
      local_40 = puVar18;
      local_3c = uVar17;
      local_30 = &local_40;
      (**(code **)(*piVar8 + 0x2b8))(piVar8,uVar1,uVar12 - 1,uVar14);
      uVar1 = local_48;
      local_48 = 0;
      if (uVar1 != 0) {
        local_ac = uVar1;
        if (local_30 == (undefined1 **)0x0) goto LAB_00076e70;
        (**(code **)(*local_30 + 0x18))(local_30,&local_ac);
      }
      if (local_30 == &local_40) {
        iVar16 = 0x10;
LAB_00076aa8:
        (**(code **)(*local_30 + iVar16))();
      }
      else {
        iVar16 = 0x14;
        if (local_30 != (undefined1 **)0x0) goto LAB_00076aa8;
      }
      param_2 = param_2 + 2;
      bVar21 = param_3 <= uVar12;
      uVar1 = (int)uVar12 >> 0x1f;
      iVar16 = uVar1 - (param_4 + !bVar21);
      uVar12 = uVar12 + 1;
    } while (uVar1 <= param_4 && (uint)bVar21 <= uVar1 - param_4);
  }
  FUN_0009ba5c(piVar8,*(undefined4 *)(DAT_00076ee0 + 0x76c30),
               *(undefined4 *)(DAT_00076ee0 + 0x76c38),local_a8,local_88);
  uVar12 = local_88;
  local_88 = 0;
  if (uVar12 != 0) {
    local_48 = uVar12;
    if (local_70 == (undefined1 **)0x0) goto LAB_00076e70;
    (**(code **)(*local_70 + 0x18))(local_70,&local_48);
  }
  if (local_70 == &local_80) {
    iVar16 = 0x10;
LAB_00076c88:
    (**(code **)(*local_70 + iVar16))();
  }
  else {
    iVar16 = 0x14;
    if (local_70 != (undefined1 **)0x0) goto LAB_00076c88;
  }
  uVar12 = local_68;
  local_68 = 0;
  if (uVar12 != 0) {
    local_48 = uVar12;
    if (local_50 == (undefined1 **)0x0) goto LAB_00076e70;
    (**(code **)(*local_50 + 0x18))(local_50,&local_48);
  }
  if (local_50 == &local_60) {
    iVar16 = 0x10;
LAB_00076ce8:
    (**(code **)(*local_50 + iVar16))();
  }
  else {
    iVar16 = 0x14;
    if (local_50 != (undefined1 **)0x0) goto LAB_00076ce8;
  }
  uVar12 = local_a8;
  local_a8 = 0;
  if (uVar12 != 0) {
    local_48 = uVar12;
    if (local_90 == (undefined1 **)0x0) {
LAB_00076e70:
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_90 + 0x18))(local_90,&local_48);
  }
  if (local_90 == &local_a0) {
    iVar16 = 0x10;
  }
  else {
    iVar16 = 0x14;
    if (local_90 == (undefined1 **)0x0) goto LAB_000766e0;
  }
  (**(code **)(*local_90 + iVar16))();
LAB_000766e0:
  if (**(int **)(DAT_00076ee4 + 0x766f0) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


