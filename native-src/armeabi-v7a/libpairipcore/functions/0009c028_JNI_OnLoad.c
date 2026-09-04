/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : JNI_OnLoad
 * Address  : 0009c028
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void JNI_OnLoad(undefined4 param_1)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  char cVar6;
  char cVar7;
  undefined1 uVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  int iVar14;
  char *pcVar15;
  int iVar16;
  __pid_t _Var17;
  undefined4 *puVar18;
  undefined1 *puVar19;
  undefined4 uVar20;
  int iVar21;
  char *__s;
  size_t sVar22;
  undefined1 *puVar23;
  undefined1 *puVar24;
  int iVar25;
  int iVar26;
  int iVar27;
  undefined4 uVar28;
  uint uVar29;
  char *pcVar30;
  int iVar31;
  int *piVar32;
  undefined4 *puVar33;
  int *piVar34;
  bool bVar35;
  int *local_7c;
  uint local_70;
  size_t local_6c;
  uint local_68;
  uint local_64;
  size_t local_60;
  undefined1 *local_5c;
  undefined1 *local_58;
  undefined4 local_54;
  undefined1 *local_50;
  undefined4 local_4c;
  undefined1 **local_40;
  undefined4 local_34;
  uint local_30;
  char *local_2c;
  int local_28;
  
  iVar21 = DAT_0009cae0;
  puVar33 = (undefined4 *)(DAT_0009cae0 + 0x9c044);
  iVar27 = DAT_0009cae0 + 0x9c04c;
  local_28 = **(int **)(DAT_0009cae4 + 0x9c048);
  FUN_0001ae24(iVar27);
  iVar14 = DAT_0009caf4;
  iVar25 = DAT_0009cae8;
  iVar31 = DAT_0009cae8 + 0x9c068;
  if (*(char *)(DAT_0009cae8 + 0x9c06b) == '\x01') {
    pcVar15 = (char *)FUN_00025e6c(DAT_0009caec + 0x9c07c);
    if (*pcVar15 == '\x01') {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009caf0 + 0x9c094);
      piVar32 = (int *)*puVar33;
    }
    else {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da00 + 0x9d900);
      piVar32 = (int *)FUN_00076fc0();
      iVar21 = DAT_0009da04;
      *puVar33 = piVar32;
      puVar23 = (undefined1 *)FUN_00025e6c(iVar21 + 0x9d91c);
      *puVar23 = 1;
    }
    goto LAB_0009d8b0;
  }
  iVar16 = DAT_0009caf8 + 0x9c0b0;
  *(undefined4 *)(DAT_0009caf4 + 0x9c0cc) = param_1;
  pcVar15 = (char *)FUN_00025e6c(iVar16);
  _Var17 = getpid();
  *(__pid_t *)(iVar14 + 0x9c0c8) = _Var17;
  if (*pcVar15 == '\x01') {
    puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009cafc + 0x9c0d4);
    piVar32 = (int *)*puVar18;
  }
  else {
    puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009cafc + 0x9c0d4);
    piVar32 = (int *)FUN_00076fc0();
    iVar14 = DAT_0009da08;
    *puVar18 = piVar32;
    puVar23 = (undefined1 *)FUN_00025e6c(iVar14 + 0x9d948);
    *puVar23 = 1;
  }
  FUN_00073858();
  FUN_000976d0(piVar32);
  if (*(char *)(iVar25 + 0x9c06a) == '\0') {
    puVar33 = (undefined4 *)FUN_000a0398(0x18);
    *puVar33 = 0;
    puVar33[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar33[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar33[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    puVar18 = puVar33 + 4;
    *(undefined1 *)puVar33 = 0x61;
    *(undefined1 *)((int)puVar33 + 1) = 0x6e;
    *(undefined1 *)((int)puVar33 + 2) = 100;
    *(undefined1 *)((int)puVar33 + 3) = 0x72;
    *(undefined1 *)(puVar33 + 1) = 0x6f;
    *(undefined1 *)((int)puVar33 + 5) = 0x69;
    *(undefined1 *)((int)puVar33 + 6) = 100;
    *(undefined1 *)((int)puVar33 + 7) = 0x2f;
    *(undefined1 *)(puVar33 + 2) = 99;
    *(undefined1 *)((int)puVar33 + 9) = 0x6f;
    *(undefined1 *)((int)puVar33 + 10) = 0x6e;
    *(undefined1 *)((int)puVar33 + 0xb) = 0x74;
    *(undefined1 *)(puVar33 + 3) = 0x65;
    *(undefined1 *)((int)puVar33 + 0xd) = 0x6e;
    *(undefined1 *)((int)puVar33 + 0xe) = 0x74;
    *(undefined1 *)((int)puVar33 + 0xf) = 0x2f;
    *puVar18 = 0;
    *(undefined1 *)puVar18 = 0x43;
    *(undefined1 *)((int)puVar33 + 0x11) = 0x6f;
    *(undefined1 *)((int)puVar33 + 0x12) = 0x6e;
    puVar33[5] = 0;
    *(undefined1 *)((int)puVar33 + 0x13) = 0x74;
    *(undefined1 *)(puVar33 + 5) = 0x65;
    *(undefined1 *)((int)puVar33 + 0x15) = 0x78;
    *(undefined1 *)((int)puVar33 + 0x16) = 0x74;
    *(undefined1 *)((int)puVar33 + 0x17) = 0;
    puVar23 = (undefined1 *)FUN_000a0370(0x18);
    uVar1 = *(undefined1 *)((int)puVar33 + 1);
    uVar2 = *(undefined1 *)((int)puVar33 + 2);
    uVar3 = *(undefined1 *)((int)puVar33 + 3);
    *puVar23 = *(undefined1 *)puVar33;
    uVar4 = *(undefined1 *)(puVar33 + 1);
    puVar23[1] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 5);
    puVar23[2] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 6);
    puVar23[3] = uVar3;
    uVar3 = *(undefined1 *)((int)puVar33 + 7);
    puVar23[4] = uVar4;
    uVar4 = *(undefined1 *)(puVar33 + 2);
    puVar23[5] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 9);
    puVar23[6] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 10);
    puVar23[7] = uVar3;
    uVar3 = *(undefined1 *)((int)puVar33 + 0xb);
    puVar23[8] = uVar4;
    uVar4 = *(undefined1 *)(puVar33 + 3);
    puVar23[9] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 0xd);
    puVar23[10] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 0xe);
    puVar23[0xb] = uVar3;
    uVar3 = *(undefined1 *)((int)puVar33 + 0xf);
    uVar5 = *(undefined1 *)puVar18;
    puVar23[0xc] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar33 + 0x11);
    puVar23[0xd] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 0x12);
    puVar23[0xe] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 0x13);
    puVar23[0xf] = uVar3;
    uVar3 = *(undefined1 *)(puVar33 + 5);
    puVar23[0x10] = uVar5;
    uVar5 = *(undefined1 *)((int)puVar33 + 0x15);
    puVar23[0x11] = uVar4;
    puVar23[0x16] = *(undefined1 *)((int)puVar33 + 0x16);
    puVar23[0x12] = uVar1;
    puVar23[0x13] = uVar2;
    puVar23[0x14] = uVar3;
    puVar23[0x15] = uVar5;
    puVar23[0x17] = 0;
    FUN_00023f74(puVar33);
    puVar19 = (undefined1 *)(**(code **)(*piVar32 + 0x18))(piVar32,puVar23);
    pcVar15 = (char *)FUN_00025e6c(DAT_0009d230 + 0x9c2a4);
    if (*pcVar15 == '\x01') {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009d234 + 0x9c2bc);
      uVar28 = *puVar33;
    }
    else {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da0c + 0x9d998);
      uVar28 = FUN_00076fc0();
      iVar25 = DAT_0009da10;
      *puVar33 = uVar28;
      puVar24 = (undefined1 *)FUN_00025e6c(iVar25 + 0x9d9b4);
      *puVar24 = 1;
    }
    local_50 = (undefined1 *)(DAT_0009d238 + 0x9c2e4);
    local_58 = puVar19;
    local_4c = uVar28;
    local_40 = &local_50;
    uVar28 = (**(code **)(*piVar32 + 0x54))(piVar32,puVar19);
    puVar19 = local_58;
    *(undefined4 *)(iVar21 + 0x9c048) = uVar28;
    bVar35 = local_58 != (undefined1 *)0x0;
    local_58 = (undefined1 *)0x0;
    if (bVar35) {
      local_34 = puVar19;
      if (local_40 == (undefined1 **)0x0) goto LAB_0009d9fc;
      (**(code **)(*local_40 + 0x18))(local_40,&local_34);
    }
    if (local_40 == &local_50) {
      iVar25 = 0x10;
LAB_0009c350:
      (**(code **)(*local_40 + iVar25))();
    }
    else {
      iVar25 = 0x14;
      if (local_40 != (undefined1 **)0x0) goto LAB_0009c350;
    }
    FUN_00023f68(puVar23,0x18);
    uVar28 = *(undefined4 *)(iVar21 + 0x9c048);
    puVar33 = (undefined4 *)FUN_000a0398(0xe);
    *puVar33 = 0;
    *(undefined1 *)puVar33 = 0x73;
    *(undefined1 *)((int)puVar33 + 1) = 0x65;
    puVar33[1] = 0;
    *(undefined1 *)((int)puVar33 + 2) = 0x6e;
    *(undefined1 *)((int)puVar33 + 3) = 100;
    *(undefined4 *)((int)puVar33 + 6) = 0;
    *(undefined1 *)(puVar33 + 1) = 0x42;
    *(undefined1 *)((int)puVar33 + 5) = 0x72;
    *(undefined1 *)((int)puVar33 + 6) = 0x6f;
    *(undefined1 *)((int)puVar33 + 7) = 0x61;
    *(undefined4 *)((int)puVar33 + 10) = 0;
    *(undefined1 *)(puVar33 + 2) = 100;
    *(undefined1 *)((int)puVar33 + 9) = 99;
    *(undefined1 *)((int)puVar33 + 10) = 0x61;
    *(undefined1 *)((int)puVar33 + 0xb) = 0x73;
    *(undefined1 *)(puVar33 + 3) = 0x74;
    *(undefined1 *)((int)puVar33 + 0xd) = 0;
    local_50 = (undefined1 *)FUN_000a0370(0x10);
    *local_50 = *(undefined1 *)puVar33;
    local_50[1] = *(undefined1 *)((int)puVar33 + 1);
    local_50[2] = *(undefined1 *)((int)puVar33 + 2);
    local_50[3] = *(undefined1 *)((int)puVar33 + 3);
    local_50[4] = *(undefined1 *)(puVar33 + 1);
    local_50[5] = *(undefined1 *)((int)puVar33 + 5);
    local_50[6] = *(undefined1 *)((int)puVar33 + 6);
    local_54 = 0xd;
    local_58 = (undefined1 *)0x11;
    local_50[7] = *(undefined1 *)((int)puVar33 + 7);
    local_50[8] = *(undefined1 *)(puVar33 + 2);
    local_50[9] = *(undefined1 *)((int)puVar33 + 9);
    local_50[10] = *(undefined1 *)((int)puVar33 + 10);
    local_50[0xb] = *(undefined1 *)((int)puVar33 + 0xb);
    uVar1 = *(undefined1 *)(puVar33 + 3);
    local_50[0xd] = 0;
    local_50[0xc] = uVar1;
    FUN_00023f74(puVar33);
    puVar19 = local_50;
    puVar23 = local_58;
    pcVar15 = (char *)FUN_000a0398(0x1c);
    pcVar15[0] = '\0';
    pcVar15[1] = '\0';
    pcVar15[2] = '\0';
    pcVar15[3] = '\0';
    *(undefined4 *)(pcVar15 + 4) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    *(undefined4 *)(pcVar15 + 8) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    *(undefined4 *)(pcVar15 + 0xc) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *pcVar15 = '(';
    pcVar15[1] = 'L';
    pcVar15[2] = 'a';
    pcVar15[3] = 'n';
    pcVar15[4] = 'd';
    pcVar15[5] = 'r';
    pcVar15[6] = 'o';
    pcVar15[7] = 'i';
    pcVar15[8] = 'd';
    pcVar15[9] = '/';
    pcVar15[10] = 'c';
    pcVar15[0xb] = 'o';
    pcVar15[0xc] = '\0';
    pcVar15[0xd] = '\0';
    pcVar15[0xe] = '\0';
    pcVar15[0xf] = '\0';
    *(undefined4 *)(pcVar15 + 0x10) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4)
    ;
    *(undefined4 *)(pcVar15 + 0x14) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8)
    ;
    *(undefined4 *)(pcVar15 + 0x18) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc)
    ;
    pcVar15[0xc] = 'n';
    pcVar15[0xd] = 't';
    pcVar15[0xe] = 'e';
    pcVar15[0xf] = 'n';
    pcVar15[0x10] = 't';
    pcVar15[0x11] = '/';
    pcVar15[0x12] = 'I';
    pcVar15[0x13] = 'n';
    pcVar15[0x14] = 't';
    pcVar15[0x15] = 'e';
    pcVar15[0x16] = 'n';
    pcVar15[0x17] = 't';
    pcVar15[0x18] = ';';
    pcVar15[0x19] = ')';
    pcVar15[0x1a] = 'V';
    pcVar15[0x1b] = '\0';
    local_2c = (char *)FUN_000a0370(0x20);
    *local_2c = *pcVar15;
    local_2c[1] = pcVar15[1];
    local_2c[2] = pcVar15[2];
    local_2c[3] = pcVar15[3];
    local_2c[4] = pcVar15[4];
    local_2c[5] = pcVar15[5];
    local_2c[6] = pcVar15[6];
    local_30 = 0x1b;
    local_34 = (undefined1 *)0x21;
    local_2c[7] = pcVar15[7];
    local_2c[8] = pcVar15[8];
    local_2c[9] = pcVar15[9];
    local_2c[10] = pcVar15[10];
    local_2c[0xb] = pcVar15[0xb];
    local_2c[0xc] = pcVar15[0xc];
    local_2c[0xd] = pcVar15[0xd];
    local_2c[0xe] = pcVar15[0xe];
    cVar6 = pcVar15[0x10];
    local_2c[0xf] = pcVar15[0xf];
    cVar7 = pcVar15[0x11];
    local_2c[0x10] = cVar6;
    cVar6 = pcVar15[0x12];
    local_2c[0x11] = cVar7;
    cVar7 = pcVar15[0x13];
    local_2c[0x12] = cVar6;
    cVar6 = pcVar15[0x14];
    local_2c[0x13] = cVar7;
    cVar7 = pcVar15[0x15];
    local_2c[0x14] = cVar6;
    cVar6 = pcVar15[0x16];
    local_2c[0x15] = cVar7;
    cVar7 = pcVar15[0x17];
    local_2c[0x16] = cVar6;
    cVar6 = pcVar15[0x18];
    local_2c[0x17] = cVar7;
    cVar7 = pcVar15[0x19];
    local_2c[0x18] = cVar6;
    cVar6 = pcVar15[0x1a];
    local_2c[0x19] = cVar7;
    local_2c[0x1b] = '\0';
    local_2c[0x1a] = cVar6;
    FUN_00023f74(pcVar15);
    if (((uint)puVar23 & 1) == 0) {
      puVar19 = (undefined1 *)((uint)&local_58 | 1);
    }
    pcVar15 = local_2c;
    if (((uint)local_34 & 1) == 0) {
      pcVar15 = (char *)((uint)&local_34 | 1);
    }
    uVar28 = (**(code **)(*piVar32 + 0x84))(piVar32,uVar28,puVar19,pcVar15);
    *(undefined4 *)(DAT_0009d608 + 0x9c72c) = uVar28;
    if (((uint)local_34 & 1) != 0) {
      FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
    }
    if (((uint)local_58 & 1) != 0) {
      FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
    }
    (**(code **)(*piVar32 + 0x44))(piVar32);
    uVar28 = *(undefined4 *)(DAT_0009d60c + 0x9c704);
    pcVar15 = (char *)FUN_000a0398(0xe);
    builtin_strncpy(pcVar15,"startActivity",0xe);
    local_2c = (char *)FUN_000a0370(0x10);
    *local_2c = *pcVar15;
    local_2c[1] = pcVar15[1];
    local_2c[2] = pcVar15[2];
    local_2c[3] = pcVar15[3];
    local_2c[4] = pcVar15[4];
    local_2c[5] = pcVar15[5];
    local_2c[6] = pcVar15[6];
    local_30 = 0xd;
    local_34 = (undefined1 *)0x11;
    local_2c[7] = pcVar15[7];
    local_2c[8] = pcVar15[8];
    local_2c[9] = pcVar15[9];
    local_2c[10] = pcVar15[10];
    local_2c[0xb] = pcVar15[0xb];
    cVar6 = pcVar15[0xc];
    local_2c[0xd] = '\0';
    local_2c[0xc] = cVar6;
    FUN_00023f74(pcVar15);
    pcVar15 = local_2c;
    puVar23 = local_34;
    puVar18 = (undefined4 *)FUN_000a0398(0x1c);
    *puVar18 = 0;
    puVar18[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar18[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar18[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *(undefined1 *)puVar18 = 0x28;
    *(undefined1 *)((int)puVar18 + 1) = 0x4c;
    *(undefined1 *)((int)puVar18 + 2) = 0x61;
    *(undefined1 *)((int)puVar18 + 3) = 0x6e;
    *(undefined1 *)(puVar18 + 1) = 100;
    *(undefined1 *)((int)puVar18 + 5) = 0x72;
    *(undefined1 *)((int)puVar18 + 6) = 0x6f;
    *(undefined1 *)((int)puVar18 + 7) = 0x69;
    *(undefined1 *)(puVar18 + 2) = 100;
    *(undefined1 *)((int)puVar18 + 9) = 0x2f;
    *(undefined1 *)((int)puVar18 + 10) = 99;
    *(undefined1 *)((int)puVar18 + 0xb) = 0x6f;
    puVar18[3] = 0;
    puVar18[4] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar18[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar18[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *(undefined1 *)(puVar18 + 3) = 0x6e;
    *(undefined1 *)((int)puVar18 + 0xd) = 0x74;
    *(undefined1 *)((int)puVar18 + 0xe) = 0x65;
    *(undefined1 *)((int)puVar18 + 0xf) = 0x6e;
    *(undefined1 *)(puVar18 + 4) = 0x74;
    *(undefined1 *)((int)puVar18 + 0x11) = 0x2f;
    *(undefined1 *)((int)puVar18 + 0x12) = 0x49;
    *(undefined1 *)((int)puVar18 + 0x13) = 0x6e;
    *(undefined1 *)(puVar18 + 5) = 0x74;
    *(undefined1 *)((int)puVar18 + 0x15) = 0x65;
    *(undefined1 *)((int)puVar18 + 0x16) = 0x6e;
    *(undefined1 *)((int)puVar18 + 0x17) = 0x74;
    *(undefined1 *)(puVar18 + 6) = 0x3b;
    *(undefined1 *)((int)puVar18 + 0x19) = 0x29;
    *(undefined1 *)((int)puVar18 + 0x1a) = 0x56;
    *(undefined1 *)((int)puVar18 + 0x1b) = 0;
    local_50 = (undefined1 *)FUN_000a0370(0x20);
    *local_50 = *(undefined1 *)puVar18;
    local_50[1] = *(undefined1 *)((int)puVar18 + 1);
    local_50[2] = *(undefined1 *)((int)puVar18 + 2);
    local_50[3] = *(undefined1 *)((int)puVar18 + 3);
    local_50[4] = *(undefined1 *)(puVar18 + 1);
    local_50[5] = *(undefined1 *)((int)puVar18 + 5);
    local_50[6] = *(undefined1 *)((int)puVar18 + 6);
    local_54 = 0x1b;
    local_58 = (undefined1 *)0x21;
    local_50[7] = *(undefined1 *)((int)puVar18 + 7);
    local_50[8] = *(undefined1 *)(puVar18 + 2);
    local_50[9] = *(undefined1 *)((int)puVar18 + 9);
    local_50[10] = *(undefined1 *)((int)puVar18 + 10);
    local_50[0xb] = *(undefined1 *)((int)puVar18 + 0xb);
    local_50[0xc] = *(undefined1 *)(puVar18 + 3);
    local_50[0xd] = *(undefined1 *)((int)puVar18 + 0xd);
    local_50[0xe] = *(undefined1 *)((int)puVar18 + 0xe);
    local_50[0xf] = *(undefined1 *)((int)puVar18 + 0xf);
    local_50[0x10] = *(undefined1 *)(puVar18 + 4);
    local_50[0x11] = *(undefined1 *)((int)puVar18 + 0x11);
    local_50[0x12] = *(undefined1 *)((int)puVar18 + 0x12);
    local_50[0x13] = *(undefined1 *)((int)puVar18 + 0x13);
    local_50[0x14] = *(undefined1 *)(puVar18 + 5);
    local_50[0x15] = *(undefined1 *)((int)puVar18 + 0x15);
    local_50[0x16] = *(undefined1 *)((int)puVar18 + 0x16);
    local_50[0x17] = *(undefined1 *)((int)puVar18 + 0x17);
    local_50[0x18] = *(undefined1 *)(puVar18 + 6);
    local_50[0x19] = *(undefined1 *)((int)puVar18 + 0x19);
    uVar1 = *(undefined1 *)((int)puVar18 + 0x1a);
    local_50[0x1b] = 0;
    iVar21 = DAT_0009d9c0;
    local_50[0x1a] = uVar1;
    puVar33 = (undefined4 *)(iVar21 + 0x9c9f0);
    FUN_00023f74(puVar18);
    if (((uint)puVar23 & 1) == 0) {
      pcVar15 = (char *)((uint)&local_34 | 1);
    }
    puVar23 = local_50;
    if (((uint)local_58 & 1) == 0) {
      puVar23 = (undefined1 *)((uint)&local_58 | 1);
    }
    uVar28 = (**(code **)(*piVar32 + 0x84))(piVar32,uVar28,pcVar15,puVar23);
    *puVar33 = uVar28;
    if (((uint)local_58 & 1) != 0) {
      FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
    }
    iVar14 = DAT_0009da18;
    iVar25 = DAT_0009da14;
    iVar31 = DAT_0009da14 + 0x9ca64;
    if (((uint)local_34 & 1) != 0) {
      FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
    }
    iVar16 = (**(code **)(*piVar32 + 0x44))(piVar32);
    iVar26 = *(int *)(iVar21 + 0x9c9f4);
    if (iVar26 != 0) {
      iVar16 = *(int *)((int)&DAT_0009cae0 + iVar14);
    }
    if (iVar26 != 0 && iVar16 != 0) {
      bVar35 = *(int *)(DAT_0009da1c + 0x9cac4) != 0;
      *(bool *)(iVar25 + 0x9ca66) = bVar35;
      if (bVar35) goto LAB_0009cad0;
      *(undefined4 *)((int)&DAT_0009cae0 + iVar14) = 0;
LAB_0009cb08:
      (**(code **)(*piVar32 + 0x58))(piVar32);
      *(undefined4 *)(iVar21 + 0x9c9f4) = 0;
    }
    else {
      *(undefined4 *)((int)&DAT_0009cae0 + iVar14) = 0;
      *(undefined1 *)(iVar25 + 0x9ca66) = 0;
      *puVar33 = 0;
      if (iVar26 != 0) goto LAB_0009cb08;
    }
    *(undefined1 *)(iVar25 + 0x9ca66) = 0;
    cVar6 = *(char *)(iVar25 + 0x9ca68);
  }
  else {
LAB_0009cad0:
    cVar6 = *(char *)(iVar31 + 4);
  }
  if (cVar6 == '\0') {
    pcVar15 = (char *)FUN_00025e6c(DAT_0009da20 + 0x9cb3c);
    if (*pcVar15 == '\x01') {
      puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009da24 + 0x9cb54);
      piVar34 = (int *)*puVar18;
    }
    else {
      puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009da28 + 0x9d9d0);
      piVar34 = (int *)FUN_00076fc0();
      iVar21 = DAT_0009da2c;
      *puVar18 = piVar34;
      puVar23 = (undefined1 *)FUN_00025e6c(iVar21 + 0x9d9ec);
      *puVar23 = 1;
    }
    FUN_0009f240(&local_58);
    if (local_58 != (undefined1 *)0x0) {
      uVar20 = (**(code **)(*piVar34 + 0x54))(piVar34);
      puVar33[3] = uVar20;
      puVar33 = (undefined4 *)FUN_000a0398(7);
      uVar29 = 0;
      *puVar33 = 0;
      *(undefined1 *)puVar33 = 0x69;
      *(undefined1 *)((int)puVar33 + 1) = 0x6e;
      *(undefined4 *)((int)puVar33 + 3) = 0;
      *(undefined1 *)((int)puVar33 + 2) = 0x76;
      *(undefined1 *)((int)puVar33 + 3) = 0x6f;
      *(undefined1 *)(puVar33 + 1) = 0x6b;
      *(undefined1 *)((int)puVar33 + 5) = 0x65;
      *(undefined1 *)((int)puVar33 + 6) = 0;
      local_34._0_2_ = CONCAT11(*(undefined1 *)puVar33,0xc);
      local_34._0_3_ = CONCAT12(*(undefined1 *)((int)puVar33 + 1),(undefined2)local_34);
      local_34 = (undefined1 *)CONCAT13(*(undefined1 *)((int)puVar33 + 2),(undefined3)local_34);
      local_30 = (uint)*(uint3 *)((int)puVar33 + 3);
      FUN_00023f74();
      pcVar15 = local_2c;
      puVar23 = local_34;
      puVar33 = (undefined4 *)FUN_000a0398(0x3a);
      uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      uVar12 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
      uVar13 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      *puVar33 = 0;
      puVar33[1] = uVar28;
      puVar33[2] = uVar12;
      puVar33[3] = uVar13;
      puVar33[4] = 0;
      puVar33[5] = uVar28;
      puVar33[6] = uVar12;
      puVar33[7] = uVar13;
      puVar33[8] = 0;
      puVar33[9] = uVar28;
      puVar33[10] = uVar12;
      puVar33[0xb] = uVar13;
      *(undefined4 *)((int)puVar33 + 0x2a) = 0;
      *(undefined4 *)((int)puVar33 + 0x2e) = uVar28;
      *(undefined4 *)((int)puVar33 + 0x32) = uVar12;
      *(undefined4 *)((int)puVar33 + 0x36) = uVar13;
      iVar21 = DAT_0009da30 + 0x9cc54;
      do {
        *(byte *)((int)puVar33 + uVar29) =
             *(byte *)(iVar21 + (uVar29 & 7)) ^ *(byte *)(iVar21 + uVar29 + 8);
        uVar29 = uVar29 + 1;
      } while (uVar29 != 0x3a);
      local_5c = (undefined1 *)FUN_000a0370(0x40);
      uVar1 = *(undefined1 *)((int)puVar33 + 1);
      uVar2 = *(undefined1 *)((int)puVar33 + 2);
      uVar3 = *(undefined1 *)((int)puVar33 + 3);
      uVar4 = *(undefined1 *)(puVar33 + 1);
      uVar5 = *(undefined1 *)((int)puVar33 + 5);
      *local_5c = *(undefined1 *)puVar33;
      uVar8 = *(undefined1 *)((int)puVar33 + 6);
      local_5c[1] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 7);
      local_5c[4] = uVar4;
      local_5c[5] = uVar5;
      local_5c[2] = uVar2;
      local_5c[3] = uVar3;
      local_5c[6] = uVar8;
      uVar2 = *(undefined1 *)(puVar33 + 2);
      uVar3 = *(undefined1 *)((int)puVar33 + 9);
      local_60 = 0x39;
      uVar4 = *(undefined1 *)((int)puVar33 + 10);
      uVar5 = *(undefined1 *)((int)puVar33 + 0xb);
      local_64 = 0x41;
      uVar8 = *(undefined1 *)(puVar33 + 3);
      local_5c[7] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0xd);
      local_5c[8] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0xe);
      local_5c[9] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0xf);
      local_5c[10] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 4);
      local_5c[0xb] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x11);
      local_5c[0xc] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x12);
      local_5c[0xd] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x13);
      local_5c[0xe] = uVar2;
      uVar2 = *(undefined1 *)(puVar33 + 5);
      local_5c[0xf] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x15);
      local_5c[0x10] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar33 + 0x16);
      local_5c[0x11] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x17);
      local_5c[0x12] = uVar8;
      uVar8 = *(undefined1 *)(puVar33 + 6);
      local_5c[0x13] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x19);
      local_5c[0x14] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0x1a);
      local_5c[0x15] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x1b);
      local_5c[0x16] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 7);
      local_5c[0x17] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x1d);
      local_5c[0x18] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x1e);
      local_5c[0x19] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x1f);
      local_5c[0x1a] = uVar2;
      uVar2 = *(undefined1 *)(puVar33 + 8);
      local_5c[0x1b] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x21);
      local_5c[0x1c] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar33 + 0x22);
      local_5c[0x1d] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x23);
      local_5c[0x1e] = uVar8;
      uVar8 = *(undefined1 *)(puVar33 + 9);
      local_5c[0x1f] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x25);
      local_5c[0x20] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0x26);
      local_5c[0x21] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x27);
      local_5c[0x22] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 10);
      local_5c[0x23] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x29);
      local_5c[0x24] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x2a);
      local_5c[0x25] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x2b);
      local_5c[0x26] = uVar2;
      uVar2 = *(undefined1 *)(puVar33 + 0xb);
      local_5c[0x27] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x2d);
      local_5c[0x28] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar33 + 0x2e);
      local_5c[0x29] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x2f);
      local_5c[0x2a] = uVar8;
      uVar8 = *(undefined1 *)(puVar33 + 0xc);
      local_5c[0x2b] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x31);
      local_5c[0x2c] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0x32);
      local_5c[0x2d] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x33);
      local_5c[0x2e] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 0xd);
      local_5c[0x2f] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x35);
      local_5c[0x30] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x36);
      local_5c[0x31] = uVar1;
      local_5c[0x37] = *(undefined1 *)((int)puVar33 + 0x37);
      local_5c[0x32] = uVar2;
      local_5c[0x33] = uVar3;
      local_5c[0x34] = uVar4;
      local_5c[0x35] = uVar5;
      local_5c[0x36] = uVar8;
      uVar1 = *(undefined1 *)(puVar33 + 0xe);
      local_5c[0x39] = 0;
      local_5c[0x38] = uVar1;
      FUN_00023f74(puVar33);
      if (((uint)puVar23 & 1) == 0) {
        pcVar15 = (char *)((uint)&local_34 | 1);
      }
      puVar23 = local_5c;
      if ((local_64 & 1) == 0) {
        puVar23 = (undefined1 *)((uint)&local_64 | 1);
      }
      uVar28 = (**(code **)(*piVar34 + 0x1c4))(piVar34,uVar20,pcVar15,puVar23);
      iVar21 = DAT_0009da34;
      *(undefined4 *)(DAT_0009da34 + 0x9cecc) = uVar28;
      if ((local_64 & 1) == 0) {
        if (((uint)local_34 & 1) != 0) goto LAB_0009d258;
LAB_0009cec8:
        if (*(int *)(iVar21 + 0x9cecc) == 0) goto LAB_0009d274;
LAB_0009ced4:
        uVar28 = *(undefined4 *)(iVar21 + 0x9cec4);
        puVar33 = (undefined4 *)FUN_000a0398(0xb);
        *puVar33 = 0;
        *(undefined1 *)puVar33 = 0x67;
        *(undefined1 *)((int)puVar33 + 1) = 0x65;
        *(undefined1 *)((int)puVar33 + 2) = 0x74;
        puVar33[1] = 0;
        *(undefined1 *)((int)puVar33 + 3) = 0x43;
        *(undefined1 *)(puVar33 + 1) = 0x6f;
        *(undefined1 *)((int)puVar33 + 5) = 0x6e;
        *(undefined4 *)((int)puVar33 + 7) = 0;
        *(undefined1 *)((int)puVar33 + 6) = 0x74;
        *(undefined1 *)((int)puVar33 + 7) = 0x65;
        *(undefined1 *)(puVar33 + 2) = 0x78;
        *(undefined1 *)((int)puVar33 + 9) = 0x74;
        *(undefined1 *)((int)puVar33 + 10) = 0;
        local_34._0_2_ = CONCAT11(*(undefined1 *)puVar33,0x14);
        local_34._0_3_ = CONCAT12(*(undefined1 *)((int)puVar33 + 1),(undefined2)local_34);
        local_34 = (undefined1 *)CONCAT13(*(undefined1 *)((int)puVar33 + 2),(undefined3)local_34);
        local_30 = *(uint *)((int)puVar33 + 3);
        local_2c = (char *)(uint)*(uint3 *)((int)puVar33 + 7);
        FUN_00023f74();
        pcVar15 = local_2c;
        puVar23 = local_34;
        puVar33 = (undefined4 *)FUN_000a0398(0x1c);
        *puVar33 = 0;
        puVar33[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        puVar33[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        puVar33[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        *(undefined1 *)puVar33 = 0x28;
        *(undefined1 *)((int)puVar33 + 1) = 0x29;
        *(undefined1 *)((int)puVar33 + 2) = 0x4c;
        *(undefined1 *)((int)puVar33 + 3) = 0x61;
        *(undefined1 *)(puVar33 + 1) = 0x6e;
        *(undefined1 *)((int)puVar33 + 5) = 100;
        *(undefined1 *)((int)puVar33 + 6) = 0x72;
        *(undefined1 *)((int)puVar33 + 7) = 0x6f;
        *(undefined1 *)(puVar33 + 2) = 0x69;
        *(undefined1 *)((int)puVar33 + 9) = 100;
        *(undefined1 *)((int)puVar33 + 10) = 0x2f;
        *(undefined1 *)((int)puVar33 + 0xb) = 99;
        puVar33[3] = 0;
        puVar33[4] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        puVar33[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        puVar33[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        *(undefined1 *)(puVar33 + 3) = 0x6f;
        *(undefined1 *)((int)puVar33 + 0xd) = 0x6e;
        *(undefined1 *)((int)puVar33 + 0xe) = 0x74;
        *(undefined1 *)((int)puVar33 + 0xf) = 0x65;
        *(undefined1 *)(puVar33 + 4) = 0x6e;
        *(undefined1 *)((int)puVar33 + 0x11) = 0x74;
        *(undefined1 *)((int)puVar33 + 0x12) = 0x2f;
        *(undefined1 *)((int)puVar33 + 0x13) = 0x43;
        *(undefined1 *)(puVar33 + 5) = 0x6f;
        *(undefined1 *)((int)puVar33 + 0x15) = 0x6e;
        *(undefined1 *)((int)puVar33 + 0x16) = 0x74;
        *(undefined1 *)((int)puVar33 + 0x17) = 0x65;
        *(undefined1 *)(puVar33 + 6) = 0x78;
        *(undefined1 *)((int)puVar33 + 0x19) = 0x74;
        *(undefined1 *)((int)puVar33 + 0x1a) = 0x3b;
        *(undefined1 *)((int)puVar33 + 0x1b) = 0;
        local_5c = (undefined1 *)FUN_000a0370(0x20);
        *local_5c = *(undefined1 *)puVar33;
        local_5c[1] = *(undefined1 *)((int)puVar33 + 1);
        local_5c[2] = *(undefined1 *)((int)puVar33 + 2);
        local_5c[3] = *(undefined1 *)((int)puVar33 + 3);
        local_5c[4] = *(undefined1 *)(puVar33 + 1);
        local_5c[5] = *(undefined1 *)((int)puVar33 + 5);
        local_5c[6] = *(undefined1 *)((int)puVar33 + 6);
        local_60 = 0x1b;
        local_64 = 0x21;
        local_5c[7] = *(undefined1 *)((int)puVar33 + 7);
        local_5c[8] = *(undefined1 *)(puVar33 + 2);
        local_5c[9] = *(undefined1 *)((int)puVar33 + 9);
        local_5c[10] = *(undefined1 *)((int)puVar33 + 10);
        local_5c[0xb] = *(undefined1 *)((int)puVar33 + 0xb);
        local_5c[0xc] = *(undefined1 *)(puVar33 + 3);
        local_5c[0xd] = *(undefined1 *)((int)puVar33 + 0xd);
        local_5c[0xe] = *(undefined1 *)((int)puVar33 + 0xe);
        local_5c[0xf] = *(undefined1 *)((int)puVar33 + 0xf);
        iVar21 = DAT_0009da38;
        local_5c[0x10] = *(undefined1 *)(puVar33 + 4);
        local_5c[0x11] = *(undefined1 *)((int)puVar33 + 0x11);
        local_5c[0x12] = *(undefined1 *)((int)puVar33 + 0x12);
        local_5c[0x13] = *(undefined1 *)((int)puVar33 + 0x13);
        local_5c[0x14] = *(undefined1 *)(puVar33 + 5);
        local_5c[0x15] = *(undefined1 *)((int)puVar33 + 0x15);
        local_5c[0x16] = *(undefined1 *)((int)puVar33 + 0x16);
        local_5c[0x17] = *(undefined1 *)((int)puVar33 + 0x17);
        local_5c[0x18] = *(undefined1 *)(puVar33 + 6);
        local_5c[0x19] = *(undefined1 *)((int)puVar33 + 0x19);
        uVar1 = *(undefined1 *)((int)puVar33 + 0x1a);
        local_5c[0x1b] = 0;
        local_5c[0x1a] = uVar1;
        FUN_00023f74(puVar33);
        if (((uint)puVar23 & 1) == 0) {
          pcVar15 = (char *)((uint)&local_34 | 1);
        }
        puVar23 = local_5c;
        if ((local_64 & 1) == 0) {
          puVar23 = (undefined1 *)((uint)&local_64 | 1);
        }
        uVar28 = (**(code **)(*piVar34 + 0x1c4))(piVar34,uVar28,pcVar15,puVar23);
        *(undefined4 *)(iVar21 + 0x9d144) = uVar28;
        if ((local_64 & 1) != 0) {
          FUN_00023f68(local_5c,local_64 & 0xfffffffe);
        }
        iVar25 = DAT_0009da3c;
        if (((uint)local_34 & 1) != 0) {
          FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
        }
        if (*(int *)(iVar21 + 0x9d144) == 0) {
          (**(code **)(*piVar34 + 0x44))(piVar34);
        }
        *(undefined1 *)(iVar25 + 0x9d1fc) = 1;
      }
      else {
        FUN_00023f68(local_5c,local_64 & 0xfffffffe);
        if (((uint)local_34 & 1) == 0) goto LAB_0009cec8;
LAB_0009d258:
        FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
        if (*(int *)(iVar21 + 0x9cecc) != 0) goto LAB_0009ced4;
LAB_0009d274:
        iVar21 = (**(code **)(*piVar34 + 0x390))(piVar34);
        if (iVar21 != 0) {
          (**(code **)(*piVar34 + 0x44))(piVar34);
        }
      }
      puVar23 = local_58;
      bVar35 = local_58 != (undefined1 *)0x0;
      local_58 = (undefined1 *)0x0;
      if (bVar35) {
        local_34 = puVar23;
        if (local_40 == (undefined1 **)0x0) goto LAB_0009d9fc;
        (**(code **)(*local_40 + 0x18))(local_40,&local_34);
      }
    }
    if (local_40 == &local_50) {
      iVar21 = 0x10;
    }
    else {
      iVar21 = 0x14;
      if (local_40 == (undefined1 **)0x0) goto LAB_0009d304;
    }
    (**(code **)(*local_40 + iVar21))();
  }
LAB_0009d304:
  pcVar15 = (char *)FUN_00025e6c(DAT_0009da40 + 0x9d310);
  if (*pcVar15 == '\x01') {
    puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da44 + 0x9d328);
    local_7c = (int *)*puVar33;
  }
  else {
    puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da48 + 0x9d960);
    local_7c = (int *)FUN_00076fc0();
    iVar21 = DAT_0009da4c + 0x9d97c;
    *puVar33 = local_7c;
    puVar23 = (undefined1 *)FUN_00025e6c(iVar21);
    *puVar23 = 1;
  }
  FUN_0009f240(&local_58);
  pcVar15 = (char *)FUN_000a0398(0x2a);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar12 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar13 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  pcVar15[0] = '\0';
  pcVar15[1] = '\0';
  pcVar15[2] = '\0';
  pcVar15[3] = '\0';
  *(undefined4 *)(pcVar15 + 4) = uVar28;
  *(undefined4 *)(pcVar15 + 8) = uVar12;
  *(undefined4 *)(pcVar15 + 0xc) = uVar13;
  pcVar30 = pcVar15 + 0x10;
  *pcVar15 = '(';
  pcVar15[1] = '[';
  pcVar15[2] = 'B';
  pcVar15[3] = '[';
  pcVar15[4] = 'L';
  pcVar15[5] = 'j';
  pcVar15[6] = 'a';
  pcVar15[7] = 'v';
  pcVar15[8] = 'a';
  pcVar15[9] = '/';
  pcVar15[10] = 'l';
  pcVar15[0xb] = 'a';
  pcVar15[0xc] = 'n';
  pcVar15[0xd] = 'g';
  pcVar15[0xe] = '/';
  pcVar15[0xf] = 'O';
  pcVar30[0] = '\0';
  pcVar30[1] = '\0';
  pcVar30[2] = '\0';
  pcVar30[3] = '\0';
  *(undefined4 *)(pcVar15 + 0x14) = uVar28;
  *(undefined4 *)(pcVar15 + 0x18) = uVar12;
  *(undefined4 *)(pcVar15 + 0x1c) = uVar13;
  *pcVar30 = 'b';
  pcVar15[0x11] = 'j';
  pcVar15[0x12] = 'e';
  pcVar15[0x13] = 'c';
  pcVar15[0x14] = 't';
  pcVar15[0x15] = ';';
  pcVar15[0x16] = ')';
  pcVar15[0x17] = 'L';
  pcVar15[0x1a] = '\0';
  pcVar15[0x1b] = '\0';
  pcVar15[0x1c] = '\0';
  pcVar15[0x1d] = '\0';
  *(undefined4 *)(pcVar15 + 0x1e) = uVar28;
  *(undefined4 *)(pcVar15 + 0x22) = uVar12;
  *(undefined4 *)(pcVar15 + 0x26) = uVar13;
  pcVar15[0x18] = 'j';
  pcVar15[0x19] = 'a';
  pcVar15[0x1a] = 'v';
  pcVar15[0x1b] = 'a';
  pcVar15[0x1c] = '/';
  pcVar15[0x1d] = 'l';
  pcVar15[0x1e] = 'a';
  pcVar15[0x1f] = 'n';
  pcVar15[0x20] = 'g';
  pcVar15[0x21] = '/';
  pcVar15[0x22] = 'O';
  pcVar15[0x23] = 'b';
  pcVar15[0x24] = 'j';
  pcVar15[0x25] = 'e';
  pcVar15[0x26] = 'c';
  pcVar15[0x27] = 't';
  pcVar15[0x28] = ';';
  pcVar15[0x29] = '\0';
  __s = (char *)FUN_000a0370(0x30);
  cVar6 = pcVar15[1];
  *__s = *pcVar15;
  cVar7 = pcVar15[2];
  __s[1] = cVar6;
  cVar6 = pcVar15[3];
  __s[2] = cVar7;
  cVar7 = pcVar15[4];
  __s[3] = cVar6;
  cVar6 = pcVar15[5];
  __s[4] = cVar7;
  cVar7 = pcVar15[6];
  __s[5] = cVar6;
  cVar6 = pcVar15[7];
  __s[6] = cVar7;
  cVar7 = pcVar15[8];
  __s[7] = cVar6;
  cVar6 = pcVar15[9];
  __s[8] = cVar7;
  cVar7 = pcVar15[10];
  __s[9] = cVar6;
  cVar6 = pcVar15[0xb];
  __s[10] = cVar7;
  cVar7 = pcVar15[0xc];
  __s[0xb] = cVar6;
  cVar6 = pcVar15[0xd];
  __s[0xc] = cVar7;
  cVar7 = pcVar15[0xe];
  __s[0xd] = cVar6;
  cVar6 = pcVar15[0xf];
  cVar9 = *pcVar30;
  __s[0xe] = cVar7;
  cVar7 = pcVar15[0x11];
  __s[0xf] = cVar6;
  cVar6 = pcVar15[0x12];
  __s[0x10] = cVar9;
  cVar9 = pcVar15[0x13];
  __s[0x11] = cVar7;
  cVar7 = pcVar15[0x14];
  __s[0x12] = cVar6;
  cVar6 = pcVar15[0x15];
  __s[0x13] = cVar9;
  cVar9 = pcVar15[0x16];
  __s[0x14] = cVar7;
  cVar7 = pcVar15[0x17];
  __s[0x15] = cVar6;
  cVar6 = pcVar15[0x18];
  __s[0x16] = cVar9;
  cVar9 = pcVar15[0x19];
  __s[0x17] = cVar7;
  cVar7 = pcVar15[0x1a];
  cVar10 = pcVar15[0x1b];
  __s[0x18] = cVar6;
  cVar6 = pcVar15[0x1c];
  __s[0x19] = cVar9;
  cVar9 = pcVar15[0x1d];
  __s[0x1a] = cVar7;
  cVar7 = pcVar15[0x1e];
  __s[0x1b] = cVar10;
  cVar10 = pcVar15[0x1f];
  cVar11 = pcVar15[0x20];
  __s[0x1c] = cVar6;
  cVar6 = pcVar15[0x21];
  __s[0x1d] = cVar9;
  cVar9 = pcVar15[0x22];
  __s[0x1e] = cVar7;
  cVar7 = pcVar15[0x23];
  __s[0x1f] = cVar10;
  cVar10 = pcVar15[0x24];
  __s[0x20] = cVar11;
  cVar11 = pcVar15[0x25];
  __s[0x21] = cVar6;
  cVar6 = pcVar15[0x26];
  __s[0x22] = cVar9;
  cVar9 = pcVar15[0x27];
  __s[0x23] = cVar7;
  __s[0x28] = pcVar15[0x28];
  __s[0x24] = cVar10;
  __s[0x25] = cVar11;
  __s[0x26] = cVar6;
  __s[0x27] = cVar9;
  __s[0x29] = '\0';
  FUN_00023f74(pcVar15);
  sVar22 = strlen(__s);
  if (0xfffffff7 < sVar22) goto LAB_0009d9f8;
  if (sVar22 < 0xb) {
    uVar29 = (uint)&local_70 | 1;
    local_70 = CONCAT31(local_70._1_3_,(char)(sVar22 << 1));
    if (sVar22 != 0) goto LAB_0009d634;
  }
  else {
    uVar29 = FUN_000a0370((sVar22 | 7) + 1);
    local_70 = (sVar22 | 7) + 2;
    local_6c = sVar22;
    local_68 = uVar29;
LAB_0009d634:
    __aeabi_memcpy(uVar29,__s,sVar22);
  }
  *(undefined1 *)(uVar29 + sVar22) = 0;
  FUN_00023f68(__s,0x30);
  puVar33 = (undefined4 *)FUN_000a0398(10);
  *puVar33 = 0;
  *(undefined1 *)puVar33 = 0x65;
  *(undefined1 *)((int)puVar33 + 1) = 0x78;
  puVar33[1] = 0;
  *(undefined1 *)((int)puVar33 + 2) = 0x65;
  *(undefined1 *)((int)puVar33 + 3) = 99;
  *(undefined1 *)(puVar33 + 1) = 0x75;
  *(undefined1 *)((int)puVar33 + 5) = 0x74;
  *(undefined1 *)((int)puVar33 + 6) = 0x65;
  *(undefined2 *)(puVar33 + 2) = 0;
  *(undefined1 *)((int)puVar33 + 7) = 0x56;
  *(undefined1 *)(puVar33 + 2) = 0x4d;
  *(undefined1 *)((int)puVar33 + 9) = 0;
  local_34._0_2_ = CONCAT11(*(undefined1 *)puVar33,0x12);
  local_30 = *(uint *)((int)puVar33 + 3);
  local_34._0_3_ = CONCAT12(*(undefined1 *)((int)puVar33 + 1),(undefined2)local_34);
  local_34 = (undefined1 *)CONCAT13(*(undefined1 *)((int)puVar33 + 2),(undefined3)local_34);
  local_2c = (char *)(CONCAT22((short)((uint)local_2c >> 0x10),*(undefined2 *)((int)puVar33 + 7)) &
                     0xff00ffff);
  FUN_00023f74();
  pcVar15 = local_2c;
  if (((uint)local_34 & 1) == 0) {
    pcVar15 = (char *)((uint)&local_34 | 1);
  }
  sVar22 = strlen(pcVar15);
  if (0xfffffff7 < sVar22) {
LAB_0009d9f8:
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar22 < 0xb) {
    local_64 = CONCAT31(local_64._1_3_,(char)(sVar22 << 1));
    puVar23 = (undefined1 *)((uint)&local_64 | 1);
    if (sVar22 != 0) goto LAB_0009d774;
  }
  else {
    puVar23 = (undefined1 *)FUN_000a0370((sVar22 | 7) + 1);
    local_64 = (sVar22 | 7) + 2;
    local_60 = sVar22;
    local_5c = puVar23;
LAB_0009d774:
    __aeabi_memmove(puVar23,pcVar15,sVar22);
  }
  puVar23[sVar22] = 0;
  if (((uint)local_34 & 1) != 0) {
    FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
  }
  local_2c = (char *)(DAT_0009da50 + 0x9d7bc);
  local_34 = local_5c;
  if ((local_64 & 1) == 0) {
    local_34 = (undefined1 *)((uint)&local_64 | 1);
  }
  local_30 = local_68;
  if ((local_70 & 1) == 0) {
    local_30 = (uint)&local_70 | 1;
  }
  (**(code **)(*local_7c + 0x35c))(local_7c,local_58,&local_34,1);
  if ((local_64 & 1) != 0) {
    FUN_00023f68(local_5c,local_64 & 0xfffffffe);
  }
  iVar21 = DAT_0009da54;
  if ((local_70 & 1) != 0) {
    FUN_00023f68(local_68,local_70 & 0xfffffffe);
  }
  puVar23 = local_58;
  local_58 = (undefined1 *)0x0;
  if (puVar23 != (undefined1 *)0x0) {
    local_34 = puVar23;
    if (local_40 == (undefined1 **)0x0) {
LAB_0009d9fc:
      local_58 = (undefined1 *)0x0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_40 + 0x18))(local_40,&local_34);
  }
  if (local_40 == &local_50) {
    iVar25 = 0x10;
LAB_0009d89c:
    (**(code **)(*local_40 + iVar25))();
  }
  else {
    iVar25 = 0x14;
    if (local_40 != (undefined1 **)0x0) goto LAB_0009d89c;
  }
  *(undefined1 *)(iVar21 + 0x9d833) = 1;
LAB_0009d8b0:
  (**(code **)(*piVar32 + 0x10))(piVar32);
  FUN_0001ae3c(iVar27);
  if (**(int **)(DAT_0009da58 + 0x9d8dc) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_28);
  }
  return;
}


