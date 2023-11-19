package zxf.maven.plugin;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.aether.repository.RemoteRepository;

import java.util.List;

/**
 * Goal which touches a timestamp file.
 *
 * @deprecated Don't use!
 */
@Mojo(name = "zxf")
public class ZxfMojo extends AbstractMojo {

    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "${session}", readonly = true, required = true)
    private MavenSession session;

    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "${project.remoteProjectRepositories}")
    private List<RemoteRepository> projectRepos;

    /**
     * Location of the file.
     */
    @Parameter(property = "verbose", defaultValue = "false")
    private boolean verbose;

    public void execute() throws MojoExecutionException {
        getLog().info("Start to execute zxf plugin with verbose = " + verbose);
        if (verbose) {
            getLog().debug("Debug info in zxf");
        }
    }
}
