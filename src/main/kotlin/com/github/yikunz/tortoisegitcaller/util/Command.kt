package com.github.yikunz.tortoisegitcaller.util

/**
 * 所有操作tortoiseGit的代码都在这里了
 */
internal class Command {
    companion object {
        private val OPERATION_COMMAND = mapOf(
                Operation.COMMIT to "commit",
                Operation.FETCH to "fetch",
                Operation.LOG to "log",
                Operation.MERGE to "merge",
                Operation.PULL to "pull",
                Operation.PUSH to "push",
                Operation.REBASE to "rebase",
                Operation.REVERT to "revert",
                Operation.STASH_SAVE to "stashsave",
                Operation.STASH_POP to "stashpop",
                Operation.SWITCH to "switch",
                Operation.CLEAN_UP to "cleanup",
                Operation.DIFF to "diff",
                Operation.RESOLVE to "resolve",
                Operation.BLAME to "blame",
                Operation.REF_LOG to "reflog"
        )

        fun log(path: String) {
            exec(OPERATION_COMMAND[Operation.LOG].orEmpty(), path)
        }

        fun commit(path: String) {
            exec(OPERATION_COMMAND[Operation.COMMIT].orEmpty(), path)
        }

        fun fetch(path: String) {
            exec(OPERATION_COMMAND[Operation.FETCH].orEmpty(), path)
        }

        fun merge(path: String) {
            exec(OPERATION_COMMAND[Operation.MERGE].orEmpty(), path)
        }

        fun pull(path: String) {
            exec(OPERATION_COMMAND[Operation.PULL].orEmpty(), path)
        }

        fun push(path: String) {
            exec(OPERATION_COMMAND[Operation.PUSH].orEmpty(), path)
        }

        fun rebase(path: String) {
            exec(OPERATION_COMMAND[Operation.REBASE].orEmpty(), path)
        }

        fun revert(path: String) {
            exec(OPERATION_COMMAND[Operation.REVERT].orEmpty(), path)
        }

        fun stashSave(path: String) {
            exec(OPERATION_COMMAND[Operation.STASH_SAVE].orEmpty(), path)
        }

        fun stashPop(path: String) {
            exec(OPERATION_COMMAND[Operation.STASH_POP].orEmpty(), path)
        }

        fun switch(path: String) {
            exec(OPERATION_COMMAND[Operation.SWITCH].orEmpty(), path)
        }

        fun cleanUp(path: String) {
            exec(OPERATION_COMMAND[Operation.CLEAN_UP].orEmpty(), path)
        }

        fun diff(path: String) {
            exec(OPERATION_COMMAND[Operation.DIFF].orEmpty(), path)
        }

        fun resolve(path: String) {
            exec(OPERATION_COMMAND[Operation.RESOLVE].orEmpty(), path)
        }

        fun blame(path: String) {
            exec(OPERATION_COMMAND[Operation.BLAME].orEmpty(), path)
        }

        fun refLog(path: String) {
            exec(OPERATION_COMMAND[Operation.REF_LOG].orEmpty(), path)
        }

        private fun exec(operation: String, path: String) {
            val rt = Runtime.getRuntime()
            val command = "TortoiseGitProc.exe /command:$operation /path:\"$path\""
            val cmdCommand = "cmd.exe /c $command"
            rt.exec(cmdCommand, null)
        }
    }
}

enum class Operation {
    COMMIT,
    FETCH,
    LOG,
    MERGE,
    PULL,
    PUSH,
    REBASE,
    REVERT,
    STASH_POP,
    STASH_SAVE,
    SWITCH,
    CLEAN_UP,
    DIFF,
    RESOLVE,
    BLAME,
    REF_LOG
}