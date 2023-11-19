package zxf.maven.plugin;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "myInfo")
public class myInfoMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    @Parameter(defaultValue = "${session}", readonly = true, required = true)
    private MavenSession session;

    @Parameter(property = "verbose", defaultValue = "false")
    private boolean verbose;

    public void execute() throws MojoExecutionException {
        getLog().info("Start to execute myInfo of zxf plugin with verbose = " + verbose);
        if (verbose) {
            getLog().debug("Project Info: base dir, " + project.getBasedir());
        }
    }
}
