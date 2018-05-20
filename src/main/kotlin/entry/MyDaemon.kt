package entry

import org.apache.commons.daemon.Daemon
import org.apache.commons.daemon.DaemonContext

internal class MyDaemon : Daemon {

    override fun init(context: DaemonContext?) {
    }

    override fun start() {
        main()
    }

    override fun stop() {
    }

    override fun destroy() {
    }
}