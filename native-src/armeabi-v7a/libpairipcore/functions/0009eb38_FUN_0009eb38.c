/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009eb38
 * Address  : 0009eb38
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0009eb38(int *param_1,int *param_2,int param_3,int param_4)

{
  int *piVar1;
  int *piVar2;
  int *piVar3;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int extraout_r1_02;
  int extraout_r1_03;
  int extraout_r1_04;
  int extraout_r1_05;
  int extraout_r1_06;
  int extraout_r1_07;
  int extraout_r1_08;
  int iVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  uint *puVar8;
  uint uVar9;
  
  iVar6 = *param_2;
  uVar9 = param_2[1];
  uVar5 = *(uint *)(iVar6 + param_3);
  piVar1 = (int *)FUN_000a0370(0x14);
  uVar7 = ~uVar9;
  *piVar1 = 0;
  piVar1[1] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  piVar1[2] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  piVar1[3] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  piVar3 = piVar1 + 4;
  *piVar3 = 0;
  FUN_000264a4(uVar7 ^ uVar5,uVar9);
  puVar8 = (uint *)(iVar6 + extraout_r1);
  FUN_000264a4(*puVar8 ^ uVar7,uVar9);
  *piVar1 = extraout_r1_00;
  FUN_000264a4(puVar8[1] ^ uVar7,uVar9);
  piVar1[1] = extraout_r1_01;
  FUN_000264a4(puVar8[2] ^ uVar7,uVar9);
  piVar1[2] = extraout_r1_02;
  FUN_000264a4(puVar8[3] ^ uVar7,uVar9);
  piVar1[3] = extraout_r1_03;
  uVar5 = puVar8[4];
  param_1[1] = extraout_r1_00;
  FUN_000264a4(uVar5 ^ uVar7,uVar9);
  *param_1 = (int)param_2;
  *piVar3 = extraout_r1_04;
  uVar5 = *(uint *)(iVar6 + extraout_r1_01);
  piVar2 = (int *)FUN_000a0370(0xc);
  *piVar2 = 0;
  piVar2[1] = 0;
  piVar2[2] = 0;
  FUN_000264a4(uVar7 ^ uVar5,uVar9);
  puVar8 = (uint *)(iVar6 + extraout_r1_05);
  FUN_000264a4(*puVar8 ^ uVar7,uVar9);
  *piVar2 = extraout_r1_06;
  FUN_000264a4(puVar8[1] ^ uVar7,uVar9);
  piVar2[1] = extraout_r1_07;
  uVar5 = puVar8[2];
  param_1[4] = extraout_r1_07;
  param_1[6] = 0;
  param_1[0xc] = 0;
  param_1[2] = (int)param_2;
  param_1[3] = extraout_r1_06;
  FUN_000264a4(uVar5 ^ uVar7,uVar9);
  piVar2[2] = extraout_r1_08;
  FUN_00023f68(piVar2,0xc);
  iVar6 = piVar1[3];
  iVar4 = *piVar3;
  param_1[0xe] = piVar1[2];
  param_1[0xf] = iVar6;
  param_1[0x10] = iVar4;
  param_1[0x11] = param_4;
  FUN_00023f68(piVar1,0x14);
  return param_1;
}


