/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024122
 * Address  : 00024122
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00024122(int param_1)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  
  FUN_00024006(param_1 + 0x28);
  puVar1 = (uint *)FUN_0001b2d4(*(undefined4 *)(param_1 + 0x14));
  iVar2 = FUN_0001b400();
  if ((*puVar1 >> 8 | puVar1[1] << 0x18) == DAT_00024188 && DAT_00024184 == puVar1[1] >> 8) {
    uVar3 = puVar1[-1];
    if (uVar3 == 0) {
      puVar1[-2] = *(uint *)(iVar2 + 8);
      *(uint **)(iVar2 + 8) = puVar1 + -10;
    }
    puVar1[-1] = uVar3 + 1;
  }
  else {
    if (*(int *)(iVar2 + 8) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b280();
    }
    *(uint **)(iVar2 + 8) = puVar1 + -10;
  }
                    /* WARNING: Could not recover jumptable at 0x00024178. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)0x24135)(1);
  return;
}


