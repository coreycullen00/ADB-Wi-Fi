package dev.polek.adbwifi.adb

import dev.polek.adbwifi.commandexecutor.CommandExecutor

abstract class MockCommandExecutor() : CommandExecutor {

    override fun exec(command: String): Sequence<String> {
        return mockOutput(command).splitToSequence('\n')
    }

    abstract fun mockOutput(command: String): String
}