/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000732f8
 * Address  : 000732f8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000732f8(int *param_1,int param_2,uint param_3,int param_4)

{
  ushort uVar1;
  ushort uVar2;
  ushort uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint *puVar10;
  uint uVar11;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  uint uVar12;
  int iVar13;
  uint *puVar14;
  ushort *puVar15;
  char *pcVar16;
  uint *puVar17;
  uint *puVar18;
  uint uVar19;
  uint uVar20;
  ushort *puVar21;
  bool bVar22;
  
  FUN_000264a4(~(*(uint *)(param_2 + param_4) ^ param_3),param_3);
  FUN_000264a4(~(*(uint *)(param_2 + extraout_r1) ^ param_3),param_3);
  FUN_000264a4(~(((uint *)(param_2 + extraout_r1))[1] ^ param_3),param_3);
  puVar15 = (ushort *)(param_2 + extraout_r1_00);
  uVar1 = *puVar15;
  puVar21 = (ushort *)(param_2 + extraout_r1_01);
  uVar2 = *puVar21;
  uVar3 = uVar2 ^ uVar1;
  uVar20 = (uint)uVar3;
  uVar19 = uVar20 + 2;
  puVar10 = (uint *)FUN_000a0398(uVar19);
  __aeabi_memclr(puVar10,uVar19);
  uVar11 = 0;
  if (uVar20 - 0xff < 0xffffff0f) goto LAB_000733b8;
  uVar12 = (int)puVar10 - (extraout_r1_00 + param_2);
  bVar22 = 0xf < uVar12;
  if (bVar22) {
    uVar12 = (int)puVar10 - (extraout_r1_01 + param_2);
  }
  if (!bVar22 || uVar12 < 0x10) goto LAB_000733b8;
  uVar11 = uVar19 & 0x1f0;
  iVar13 = 0;
  puVar14 = puVar10;
  uVar12 = uVar11;
  do {
    puVar17 = (uint *)((int)puVar21 + iVar13);
    uVar12 = uVar12 - 0x10;
    uVar4 = puVar17[1];
    uVar5 = puVar17[2];
    uVar6 = puVar17[3];
    puVar18 = (uint *)((int)puVar15 + iVar13);
    iVar13 = iVar13 + 0x10;
    uVar7 = puVar18[1];
    uVar8 = puVar18[2];
    uVar9 = puVar18[3];
    *puVar14 = *puVar18 ^ *puVar17;
    puVar14[1] = uVar7 ^ uVar4;
    puVar14[2] = uVar8 ^ uVar5;
    puVar14[3] = uVar9 ^ uVar6;
    puVar14 = puVar14 + 4;
  } while (uVar12 != 0);
  for (; uVar19 != uVar11; uVar11 = uVar11 + 1) {
LAB_000733b8:
    *(byte *)((int)puVar10 + uVar11) =
         *(byte *)((int)puVar15 + uVar11) ^ *(byte *)((int)puVar21 + (uVar11 & 0xff));
  }
  if (uVar20 < 0xb) {
    pcVar16 = (char *)((int)param_1 + 1);
    *(char *)param_1 = (char)uVar3 << 1;
    if (uVar1 == uVar2) goto LAB_0007342c;
  }
  else {
    pcVar16 = (char *)FUN_000a0370((uVar20 | 7) + 1);
    *param_1 = (uVar20 | 7) + 2;
    param_1[1] = uVar20;
    param_1[2] = (int)pcVar16;
  }
  __aeabi_memcpy(pcVar16,(int)puVar10 + 2,uVar20);
LAB_0007342c:
  pcVar16[uVar20] = '\0';
  FUN_00023f74(puVar10);
  return;
}


