/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000228f8
 * Address  : 000228f8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000228f8(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  if (*(int *)(param_2 + 0x10) == -1) {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = 0;
    *(undefined4 *)(param_2 + 0xc) = 0;
    *(uint *)(param_2 + 0x10) = uVar2;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0xc);
    uVar1 = *(uint *)(param_2 + 0xc);
  }
  if (uVar2 <= uVar1) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00022924. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(*(int *)(param_1 + 8) + uVar1 * 4) + 0x14))();
  return;
}


